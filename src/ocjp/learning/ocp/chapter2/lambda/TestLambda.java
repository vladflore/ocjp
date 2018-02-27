package ocjp.learning.ocp.chapter2.lambda;

public class TestLambda {

    @FunctionalInterface
    interface MyInterface {

        void method1();

        default void method2() {
            System.out.println("MyInterface default method2()");
        }

        static void method3() {
            System.out.println("MyInterface static method2()");
        }
    }

    public static void main(String[] args) {
        System.out.println("It works!");
    }

}
