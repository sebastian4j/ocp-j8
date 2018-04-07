package com.sebastian.instancia;

/**
 *
 * @author sebastian
 */
public class main {
    public static void main(String[] args) {
        // A --> C
        final A a = new A(); // clase
        final C c = new A(); // interface
        // B --> D
        final B b = new B(); // clase
        final D d = new B(); // interface
        System.out.println(a instanceof A);
        System.out.println(c instanceof A);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        // d es interface java no lo compara para compilar, solo en runtime         
        System.out.println(d instanceof A); // jerarquicamente no es posible
//        System.out.println(b instanceof A); // no compila, b es clase java lo compara y jerarquicamente no es posible
        System.out.println(c instanceof D); // ambas son interfaces, se compara aunque jerarquicamente no es posible
//        System.out.println(a instanceof B); // no compila, ambas son clases, no hay relacion
        System.out.println(b instanceof C); // una es interface
        System.out.println(c instanceof B); // una es interface
    }
}
