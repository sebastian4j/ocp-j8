package com.sebastian.interfaces;

public class Main implements IA {
  public static void main(String[] args) {
    System.out.println(HOLA); // <- campos si (el que es directo (IA) )
    // new Main().hola(); <-- metodos estaticos no se heredan
  }
}
