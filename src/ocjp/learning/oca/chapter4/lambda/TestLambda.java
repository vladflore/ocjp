package ocjp.learning.oca.chapter4.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("abc");
        bunnies.add("def");
        bunnies.add("ghi");

        System.out.println(bunnies);

        removeElements(bunnies);

        System.out.println(bunnies);
    }

    /**
     * Removes elements from the given input.
     *
     * @param bunnies
     */
    private static void removeElements(List<String> bunnies) {
        bunnies.removeIf(s -> s.charAt(0) != 'd');
    }
}

