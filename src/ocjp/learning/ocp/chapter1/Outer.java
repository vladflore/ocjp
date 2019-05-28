package ocjp.learning.ocp.chapter1;

public class Outer {

    private String greeting = "Hi";

    protected class Inner {

//        compilation error
//        private static int v = 1;

        private int repeat = 3;

        private void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();

        System.out.println(inner.repeat);

        Inner1 inner1 = new Inner1();
        System.out.println(inner1.repeat);

        System.out.println(greeting);

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        Inner inner = outer.new Inner();
        inner.go();
        System.out.println(inner.repeat);
    }

}
