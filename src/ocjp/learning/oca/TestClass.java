package ocjp.learning.oca;

public class TestClass {
  // static {
  // throw new NullPointerException();
  // }

  // static {
  // if (true)
  // throw new NullPointerException();
  // }

  public float parseFloat(String s) {
    float f = 0.0f;
    try {
      f = Float.valueOf(s).floatValue();
      return f;
    } catch (NumberFormatException nfe) {
      System.out.print("Invalid input " + s);
      f = Float.NaN;
      return f;
    } finally {
      System.out.print(" finally ");
      return f;
    }
    // return f ;
  }

  public static void main(String[] args) {
    new TestClass().parseFloat("0.1");
    System.out.println();
    new TestClass().parseFloat("0x.1");
    System.out.println();
    new TestClass().parseFloat("1");
    System.out.println();
    new TestClass().parseFloat("0x1");
  }

}