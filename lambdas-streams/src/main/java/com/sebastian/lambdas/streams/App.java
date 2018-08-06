package com.sebastian.lambdas.streams;

public class App {
  private int a = 0;
  private int resta = 0;
  {
    a = a +1;
  }
  Runnable r1 = () ->{
    int a = 4;
    App.this.a = 9;
    System.out.println(App.this.a);
  };
  Runnable r2 = () -> System.out.println(toString());
  Runnable r3 = () -> System.out.println(App.this);

  public static void main(String[] args) {
    new App().r1.run();
    new App().r2.run();
    new App().r3.run();
  }

  @Override
  public String toString() {
    int suma = 0;
    //    Runnable r3 = () -> suma++; // no puedo
    Runnable r3 = () -> resta--;
    return "hola";
  }

}
