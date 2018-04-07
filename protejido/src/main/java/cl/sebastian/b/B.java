package cl.sebastian.b;

import cl.sebastian.c.C;

/**
 *
 * @author sebastian
 */
public class B {
    public void saludarB() {
        
    }
    public static void main(String[] args) {
        C c = new C();
        c.saludarA();                
        // c.saludarProtegido(); // no compila, es protected en otro package
    }
}
