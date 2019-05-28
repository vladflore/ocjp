package ocjp.learning.oca.package2;

import ocjp.learning.oca.package1.MyClass;

class X extends MyClass {
  public static void main(String args[]) {
    // int a = new MyClass().value;
    int a = new X().value;
  }
}