package ocjp.learning.ocp.chapter3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class AdditionsInJava8 {
    public static void main(String[] args) {
        Consumer<List<Integer>> mRef = Collections::sort;
        Consumer<List<Integer>> mLamb = l -> Collections.sort(l);

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favs = new HashMap<>();
        favs.put("a", "xxx");
        favs.put("b", "yy");

        favs.merge("a", "xxxx", mapper);
        favs.merge("b", "y", mapper);

        System.out.println(favs);

    }
}
