package ocjp.learning.ocp.chapter2.lambda;

import java.util.function.Predicate;

public class FindMatchingAnimals {

    public static void main(String[] args) {

        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), (Animal a) -> {
            return a.canHop();
        });

        print1(new Animal("fish", false, true), a -> a.canHop());
        print1(new Animal("kangaroo", true, false), (Animal a) -> {
            return a.canHop();
        });

    }

    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    private static void print1(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }
}