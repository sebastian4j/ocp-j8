package com.sebastian.fecha.hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class FechaHora {
  public static void main(String[] args) {
    LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
    ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
    LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
    ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
    long x = ChronoUnit.HOURS.between(zd1, zd2);
    System.out.println(zd1);
    System.out.println(zd2);
    System.out.println(x);
    System.out.println("**********************");
    List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
    System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
    System.out.println(ls.stream().max(Integer::max).get()); //2
    System.out.println(ls.stream().max(Integer::compare).get()); //3
    System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4
    ls.stream().max((i,j) -> {
      System.out.println("i: " + i + " -> j: " + j + "=" + Integer.max(i, j));
      return Integer.max(i, j);
    });
    System.out.println("::::::::::::::");
    ls.stream().max((i,j) -> {
      System.out.println("i: " + i + " -> j: " + j + "=" + Integer.compare(i, j));
      return Integer.compare(i, j);
    });
    System.out.println("___________");

    LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM.
    ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
    ZoneId nyZone = ZoneId.of("America/New_York");
    OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
    ZonedDateTime nyZdt = ldt.atZone(nyZone);
    Duration dx = Duration.between(nyOdt, nyZdt);
    System.out.println("-5:" + nyOdt);
    System.out.println("A/N:" + nyZdt);
    System.out.println(dx);

    System.out.println("----");

    System.out.println(Duration.between(LocalTime.now(), LocalTime.now().minus(3, ChronoUnit.MINUTES)));

    System.out.println(Instant.now());
    System.out.println(LocalDateTime.now());
    // periodo no cambia el tiempo
    // duracion si
    LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50");
    System.out.println(dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME));
    System.out.println(dt.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    System.out.println(dt.toString());
    ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.parse("2015-01-02T17:13:50Z"),
        ZoneId.of("America/Santiago"));
    System.out.println(zdt.format(DateTimeFormatter.ISO_DATE_TIME));
    System.out.println(zdt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    System.out.println();
    ZoneId.getAvailableZoneIds().forEach(System.out::println);
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
    Instant.ofEpochMilli(5).plus(1, ChronoUnit.DAYS);
  }
}
