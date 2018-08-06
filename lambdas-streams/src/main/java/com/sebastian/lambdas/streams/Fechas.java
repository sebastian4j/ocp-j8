package com.sebastian.lambdas.streams;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Fechas {

  public static void main(String[] args) {
    final Date d = new Date(2018 - 1900, 12, 32); // mes desde 0
    System.out.println(d);
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, 2018);
    cal.set(Calendar.MONTH, 13); // mes desde 0
    cal.set(Calendar.DAY_OF_MONTH, 43);
    System.out.println(cal.getTime());
    LocalDate ld = LocalDate.of(2018, 0, 30); // exception
    System.out.println(ld);
  }

}
