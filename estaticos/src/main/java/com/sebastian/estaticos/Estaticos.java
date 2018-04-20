package com.sebastian.estaticos;

/**
 *
 * @author sebastian
 */
public class Estaticos {
    interface Interface {
        default void saludo() {
            System.out.println("hola desde la interface");
        }
    }
    static class Hola implements Interface {
        @Override
        public void saludo() {
//        public static void saludo() {            
            System.out.println("hola desde Hola");
        }
    }
    
    private class Chao implements Interface { 
    }
    
    public static void main(String[] args) {
        new Hola().saludo();
//        new Chao().saludo(); <-- no se puede, no es estatica
        new Estaticos().new Chao().saludo();
    }
}
