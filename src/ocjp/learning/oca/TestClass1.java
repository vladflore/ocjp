package ocjp.learning.oca;

class MyClass {
}

public class TestClass1 {
   MyClass getMyClassObject() {
      MyClass mc = new MyClass(); // 1
      System.out.println(mc);
      return mc; // 2
   }

   public static void main(String[] args) {
      TestClass1 tc = new TestClass1(); // 3
      MyClass x = tc.getMyClassObject(); // 4
      System.out.println(x);
      System.out.println("got myclass object"); // 5
      x = new MyClass(); // 6
      System.out.println("done"); // 7
   }
}