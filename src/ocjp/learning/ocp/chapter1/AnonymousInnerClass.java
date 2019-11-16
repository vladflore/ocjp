package ocjp.learning.ocp.chapter1;

public class AnonymousInnerClass {

    abstract class B {
        int value() {
            return 7;
        }
    }

    void m() {
        B b = new B() {
        };
        System.out.println(b.value());
    }

    public static void main(String[] args) {
        new AnonymousInnerClass().m();
    }

}
