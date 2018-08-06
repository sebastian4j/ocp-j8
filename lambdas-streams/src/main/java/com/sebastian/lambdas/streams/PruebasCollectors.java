package com.sebastian.lambdas.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PruebasCollectors {
  public static void main(String[] args) {
    List<Double> lista = List.of();
    double d = lista.stream().collect(Collectors.averagingDouble(x -> x));
    System.out.println(d); // 0.0 si no hay elementos
    long l = lista.stream().collect(Collectors.counting());
    System.out.println(l);
  }
}
