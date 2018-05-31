package com.sebastian.lambdas.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author sebastian
 */
public class Main {
  public static void main(String[] args) {
    new Main().metodo1().metodo2().metodo3();

  }

  private Main metodo3() {
    Stream inf1 = Stream.iterate(1, n -> n + 1);
    inf1.skip(ThreadLocalRandom.current().nextInt(1, 10)).limit(5).forEach(System.out::println);
    return this;
  }

  private Main metodo1() {
    // metodos estaticos
    Consumer<List<Integer>> c1 = Collections::sort; // referencia metodo
    Consumer<List<Integer>> c2 = l -> Collections.sort(l); // lambda
    // metodos de instancia
    String str = "abc";
    Predicate<String> p1 = str::startsWith; // referencia metodo
    Predicate<String> p2 = s -> str.startsWith(s); // lambda
    // metodos de instancia sin conocer la instancia
    Predicate<String> p3 = String::isEmpty; // referencia metodo
    Predicate<String> p4 = s -> s.isEmpty(); // lambda
    // constructor referencia
    Supplier<ArrayList> s1 = ArrayList::new;
    Supplier<ArrayList> s2 = () -> new ArrayList();
    return this;
  }

  private Main metodo2() {
    Stream<String> str = Stream.of("h", "o", "l", "a");
    System.out.println(
        "concat: " + str.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append));
    // no se puede reutilizar el stream
    str = Stream.of("h", "o", "l", "a");
    System.out
        .println("to-collection: " + str.collect(Collectors.toCollection(LinkedHashSet::new)));
    str = Stream.of("h", "o", "l", "a");
    System.out.println("to-set: " + str.collect(Collectors.toSet()));
    return this;
  }
}
