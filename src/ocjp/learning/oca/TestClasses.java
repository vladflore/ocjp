package ocjp.learning.oca;

import java.time.LocalDate;
import java.util.ArrayList;

class Animal {
  void crazyLoop() {

    label1: {
      break label1;
    }

    int c = 0;
    JACK: while (c < 8) {
      JILL: {
        System.out.println(c);
        break JILL;
      }
      if (c > 3)
        break JACK;
      else
        c++;
    }
  }
}

class Dog extends Animal {

}

class Husky extends Dog {

}

public class TestClasses {
  public static void main(String args[]) {

    // List l = new ArrayList<>();

    Animal a = new Dog();
    Dog d = (Dog) a;
    System.out.println(d);

    Animal animal = new Husky();
    Dog dog = (Dog) animal;
    System.out.println(dog);

    short s = Short.MAX_VALUE;
    // char c = s;
    System.out.println((int) Character.MAX_VALUE);
    char c = 32767;
    // char c1 = -32768;
    System.out.println(c == Short.MAX_VALUE);

    StringBuilder b1 = new StringBuilder("snorkler");
    StringBuilder b2 = new StringBuilder("yoodler");

    // System.out.println(b1.replace(3, 4,
    // b2.substring(4)).append(b2.append(false)));
    System.out.println(b1.replace(3, 4, b2.substring(4)));

    label_2: {
      System.out.println("label_2");
    }

    label_1: {
      System.out.println("label_1");
      for (;;) {
        System.out.println("inside for");
        // break label_2;
        break label_1;
      }
    }

    String str = "";
    Exception ex = new Exception();
  }
}