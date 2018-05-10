package com.sebastian.lambdas.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author sebastian
 */
public class Main {
    public static void main(String[] args) {
        new Main().metodo1();
    }
    private void metodo1() {
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
    }
}
