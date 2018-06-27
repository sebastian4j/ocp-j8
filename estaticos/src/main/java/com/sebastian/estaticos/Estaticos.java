package com.sebastian.estaticos;

/**
 *
 * @author sebastian
 */
public class Estaticos {
    interface Interface {
        static void saludoEstatico() {
            
        }
        default void saludo() {
//        default static void saludo() { <-- static o default
            System.out.println("hola desde la interface");
        }
    }
    static class Hola implements Interface {
//        @Override <-- no se puede, no es de la instancia, es de la clase
        public void saludoEstatico() { } // no es un override
        @Override
        public void saludo() {
//        public static void saludo() {            
            System.out.println("hola desde Hola");
        }
    }
    
    private class Chao implements Interface { 
    }
    
    public static void main(String[] args) {
      new AAA.BBB();
        new Hola().saludo();
//        new Hola().saludoEstatico(); <-- error, no le pertenece a hola
        Interface.saludoEstatico();
//        new Chao().saludo(); <-- no se puede, no es estatica
        new Estaticos().new Chao().saludo();
    }
}
