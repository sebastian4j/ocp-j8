package cl.sebastian.c;

import cl.sebastian.a.A;

/**
 *
 * @author sebastian
 */
public class C extends A {
    public void saludarA() {
        System.out.println("invocar protected");
        saludarProtected();
        System.out.println("fin protected");
    }
    protected void saludarProtegido() {
        saludarProtected();
        System.out.println("saludar protegido no heredado");
    }
}
