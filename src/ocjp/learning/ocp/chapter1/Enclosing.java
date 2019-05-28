package ocjp.learning.ocp.chapter1;

public class Enclosing {
    private static class Nested {
        private static void staticMethod() {
            System.out.println(pret);
        }

        private int price = 6;
        private static int pret = 5;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
        System.out.println(nested.pret);
        System.out.println(Nested.pret);
        nested.staticMethod();

        Enclosing enclosing = new Enclosing();
//        enclosing.Nested();
//        enclosing.new Nested();

    }
}
