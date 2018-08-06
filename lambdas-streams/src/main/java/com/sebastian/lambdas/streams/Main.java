package com.sebastian.lambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Sebastian Avila A.
 */
public class Main {
  final int iiiii = 34;
  Runnable r = () -> {
    int iiiii = 4; // si puede redeclarar campos de la clase
  };
  static class Employee {
    int age;
  }

  public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
    Employee x = new Employee();
    x.age = 1000;
    return p.test(x);
  }

  public static void main(String[] args) {
    final int ii = 2;
    Runnable r = () -> {
      //            int ii = 4; --> no compila, no puede redeclarar la variable local
    };

    Employee e = new Employee();
    System.out.println(validateEmployee(e, x -> e.age > 0));


    String sentence1 = "Carpe diem. Seize the day, boys. Make your lives extraordinary.";
    String sentence2 = "Frankly, my dear, I don't give a damn!";
    String sentence3 = "Do I look like I give a damn?";
    List<String> sentences = Arrays.asList(sentence1, sentence2, sentence3);


    Stream<String> sds = Stream.of("g g g g".split(" "));
    String[] dd = new String[] {"f", "f"};
    int[] ddd = new int[] {4, 4};
    Stream<String> dddd = Stream.of(dd);
    Stream<String> xxx = Arrays.stream(dd);
    IntStream xx = Arrays.stream(ddd);
    Stream<int[]> ddddd = Stream.of(ddd);

    Stream<Integer> sss = Stream.of(1, 2);
    sentences.stream().flatMap(str -> Stream.of(str.split("[ ,.!?\r\n]"))).peek(System.out::println)
    .filter(s -> s.length() > 0).distinct().forEach(System.out::println);

    List<String> l1 = Arrays.asList("a", "b");
    List<String> l2 = Arrays.asList("1", "2");
    Stream.of(l1, l2).flatMap((x) -> Stream.of(x)).peek(x -> System.out.println(x.getClass()))
    .forEach((x) -> {
      System.out.println(x.getClass());
      System.out.println(x);
    });

    Stream.of(l1, l2).flatMap((x) -> x.stream()).peek(x -> System.out.println(">>" + x.getClass()))
    .forEach((x) -> {
      System.out.println(x.getClass());
      System.out.println(x);
    });

    Predicate d;

    System.out.println();
    Stream.iterate("-", s -> s + s).limit(10).forEach(System.out::println);
    System.out.println(
        Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));
    List<Integer> l = IntStream.range(1, 6).mapToObj(i -> i).collect(Collectors.toList());
    l.forEach(System.out::println);

    Map<String, Double> sssa;
    List<String> s = null;
    Stream.of(s);

    Stream<Integer> ss = Stream.of(1, 2);
    List<Integer> li = new ArrayList<>();
    li.add(3);
    li.add(1);
    li.add(2);
    li.stream().sorted().forEach(lx -> {
      li.add(lx);
    });
    System.out.println("__");
    li.forEach(System.out::println);
    System.out.println("__");
    // ss.count();
    // ss.mapToInt(x -> x).sum();
    new Main().metodo1().metodo2().metodo3().metodo4();
  }

  private Main metodo4() {
    IntSummaryStatistics is = IntStream.of(1, 2, 3).summaryStatistics();
    System.out.println(is.getCount());
    System.out.println(is.getMin());
    System.out.println(is.getSum());
    System.out.println(is.getMax());
    System.out.println(is.getAverage());
    DoubleSummaryStatistics ds = DoubleStream.of(1, 3, 4).summaryStatistics();
    BooleanSupplier bs = () -> Math.random() > .5;
    return this;
  }

  private Main metodo3() {
    Stream<Integer> inf1 = Stream.iterate(1, n -> n + 1);
    inf1.skip(ThreadLocalRandom.current().nextInt(1, 10)).limit(5).forEach(System.out::println);
    Stream<String> nombres = Stream.of("qw", "asdf", "dff", "fregfe");
    System.out.println("map");
    nombres.map(String::length).forEach(System.out::println);
    System.out.println("flat-map");
    List<String> l1 = List.of("A", "B", "C");
    List<String> l2 = List.of("D", "E", "F");
    List<String> l3 = List.of("G", "H", "I");
    List<String> l4 = List.of();
    Stream<List<String>> lx = Stream.of(l1, l2, l3, l4);
    lx.flatMap(l -> l.stream()).forEach(System.out::println);
    System.out.println("sorted");
    nombres = Stream.of("a", "b", "c", "d");
    nombres.sorted().forEach(System.out::println);
    nombres = Stream.of("a", "b", "c", "d");
    nombres.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    nombres = Stream.of("a", "b", "c", "d");
    nombres.sorted(new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return 1;
      }
    }).forEach(System.out::println);
    // nombres.sorted(Comparator::reverseOrder).forEach(System.out::println); // error
    System.out.println("EOF");
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
