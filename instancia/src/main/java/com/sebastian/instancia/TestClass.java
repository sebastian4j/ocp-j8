package com.sebastian.instancia;

public class TestClass {
  public class AA {
  }
  public static class BB {
    public void bb() {
      System.out.println("hola");
    }
    public static void cc() {
      System.out.println("hola");
    }
  }

  public void useClasses() {
    new TestClass();
    var a = new AA();
    a = new TestClass.AA();
    a = new TestClass().new AA();
    var b = new TestClass.BB();    
    new BB();
    new TestClass. BB();
  }

  public static void main(String[] a) {
//    new AA(); // no compila
    new BB();
    new TestClass().new AA();
    new TestClass. BB();
    new TestClass. BB().bb();
    TestClass.BB.cc();
//    new TestClass.AA(); // no compila
  }
}
