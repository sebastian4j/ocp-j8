package com.sebastian.lambdas.streams;

import java.util.function.Function;

public class IntDouble {
  public static void main(String[] args) {
    double principle = 100;
    int interestrate = 5;
    double amount = compute(principle, x -> x * interestrate);
    double a = 345;
    System.out.println((Double)a);
  }

  public static double compute(double base, Function<Integer, Integer> func) {
    return func.apply((int) base);
  }
}
