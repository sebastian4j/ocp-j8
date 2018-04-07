package cl.sebastian.c;

/**
 *
 * @author sebastian
 */
public class BB {
    public void saludarB() {
        
    }
    public static void main(String[] args) {
        C c = new C();
        c.saludarA();         
        c.saludarProtegido(); // compila, puede acceder en el mismo package
    }
}
