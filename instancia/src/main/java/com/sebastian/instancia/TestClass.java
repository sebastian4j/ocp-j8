package com.sebastian.instancia;

public class TestClass {
  public class AA {

  }

  public static class BB {
    public static void bb() {

    }
  }

  public void aa() {
    new TestClass();
    new AA();
    new BB();
    new TestClass.AA();
    new TestClass.BB();
    new TestClass().new AA();
//  new TestClass().new BB();
    TestClass.BB.bb();
  }

  public static void bb() {
    new TestClass();
//  new AA();
    new BB();
//  new TestClass.AA();
    new TestClass.BB();
    new TestClass().new AA();
//    new TestClass().new BB();
    TestClass.BB.bb();
  }
}
