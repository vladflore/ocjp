package ocjp.learning.ocp.chapter1;

public class Outer1 {
    private int length = 5;

    private void calculate() {
        /*final*/
        int width = 0;
//        width = width + 5;
        class Inner {

//            static int x;

            private void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.calculate();
    }

}
