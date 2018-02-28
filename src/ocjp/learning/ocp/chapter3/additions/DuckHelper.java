package ocjp.learning.ocp.chapter3.additions;

import java.util.Comparator;

public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }

    public static void main(String[] args) {
        Duck duck1 = new Duck("d1", 5);
        Duck duck2 = new Duck("d2", 9);

        Comparator<Duck> byWeight = (d1, d2) -> compareByWeight(d1, d2);
        System.out.println(byWeight.compare(duck1, duck2));


        byWeight = DuckHelper::compareByWeight;
        System.out.println(byWeight.compare(duck1, duck2));

    }
}