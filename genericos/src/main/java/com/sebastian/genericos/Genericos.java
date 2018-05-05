package com.sebastian.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian
 */
public class Genericos {

    class A {
    }

    interface D {
    }

    class B extends A {
        public void chao() {
        }
    }

    class C extends B implements D {

        public void saludar() {
        }
    }

    public static void main(String[] args) {
        new Genericos().validar();
    }

    private void validar() {
        validarList();
    }

    private void validarList() {
//        List<C> aa = new ArrayList<A>(); error, tiene que ser el mismo tipo
        List<C> bb = new ArrayList<C>(); // se puede omitir el C, B, D de la derecha
        List<B> dd = new ArrayList<B>();
        List<D> ee = new ArrayList<D>(); // puede ser la interface
//        List<C> ff = new ArrayList<B>(); error, tiene que ser el mismo tipo
//        List<C> cc = new ArrayList<D>(); error, tiene que ser el mismo tipo
//        List<? extends B> gg = new ArrayList<A>(); error
        List<? extends B> gg = new ArrayList<B>();
//        gg.add(new B()); error, inmutable
//        List<T extends A> nn = new ArrayList<B>(); error, no puede ir T solo ?
        List<? extends A> hh = new ArrayList<B>();
//        hh.add(new A()); error, inmutable
        List<? extends A> ii = new ArrayList<C>();
//        ii.add(new A()); // error, inmutable
//        List<T extends A> jj = new ArrayList<C>(); error, solo el ?
//        List<? extends A> kk = new ArrayList<? extends C>(); error, solo el de la izquierda
        List<? super B> ll = new ArrayList<B>();
        ll.add(new B());
//        ll.add(new Object()); // error solo B y supertipos (no object)
//        List<? super B> mm = new ArrayList<C>(); error, no C es super
        List<? super C> mm = new ArrayList<D>();
        mm.add(new C());
//        mm.add(new Object()); error, solo D y supertipos
//        mm.add(new B()); error, solo D y supertipos
//        mm.add(new A()); error, solo D y supertipos
        final List<B> bbb = new ArrayList<B>();
        bbb.add(new B());
        gg(bbb);
        gg(new ArrayList<A>());
        gg(new ArrayList<C>());
    }

    private <T> List<T> aa(T t) {
        return new ArrayList<T>();
    }

//    private <T super A> List<T> bb(T t) {  error
    private <T extends A> List<T> bb(T t) {
        return new ArrayList<T>();
    }
//     no puede ir el ?, tiene que ser T
/*    private <? extends A> List<T> cc(T t) { 
        return new ArrayList<T>();
    }
     */
//    no puede ser super
//    private <T super C> void cc(T t) {
//    private <? super C> void cc(T t) {        
//    }
//    private <T> <? extends A> dd(List<T> t) { error ? extends no se puede
//        t.add(new T()); error        
//    }
    private <T> D ff(List<? extends T> t) {
//        t.add(new A()); error
//        t.add(new T()); error
        return null;
    }

    private <T> D ee(List<? super T> t) {
//        t.add(new T()); error
//        t.add(new A()); error
        return null;
    }

    private void gg(List<? super C> t) {
        t.add(new C());
        
        t.stream().forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e.toString()); // solo puede ser utilizado como Object
        });
//        t.add(new A()); solo C
//        t.add(new B()); solo C
    }
}
