package com.sebastian.lambdas.streams;

import java.util.stream.IntStream;

public class Ppa {
  public static void main(String[] args) {
    IntStream.iterate(1, n -> n * 2).limit(10).forEachOrdered(System.out::println);
  }
}
