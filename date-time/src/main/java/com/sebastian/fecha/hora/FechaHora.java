package com.sebastian.fecha.hora;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class FechaHora {
  public static void main(String[] args) {
    // periodo no cambia el tiempo
    // duracion si
    LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

    ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    date = date.plus(Duration.ofDays(1));
    System.out.println(date);

    date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    date = date.plus(Period.ofDays(1));
    System.out.println(date);
    System.out.println();
    ////
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    System.out.println(d.format(f));

    LocalDateTime dd = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period pp = Period.ofDays(1).ofYears(2);
    dd = dd.minus(pp);
    DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(ff.format(dd));
    String a = Duration.of(1, ChronoUnit.MINUTES).toString();
    String aa = Duration.ofMinutes(1).toString();
    System.out.println(Duration.of(60, ChronoUnit.SECONDS).toString());
    System.out.println(Duration.ofDays(1).toString());
    System.out.println(Duration.ofNanos(1).toString());
    System.out.println(a);
    System.out.println(aa);
    System.out.println(a == aa);
    System.out.println();
    System.out.println(Period.ofDays(365));
    System.out.println(Period.ofMonths(12));
    System.out.println(Period.ofWeeks(1));
    System.out.println(Period.ofYears(1));
    System.out.println();
  }
}
