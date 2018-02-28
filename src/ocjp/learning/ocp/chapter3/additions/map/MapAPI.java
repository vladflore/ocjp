package ocjp.learning.ocp.chapter3.additions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapAPI {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();

        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");

        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

        BiFunction<String, String, String> mapper = (v1, v2) -> {
            System.out.println("v1:" + v1);
            return v1.length() > v2.length() ? v1 : v2;
        };

        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("Sam", null);

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        String sam = favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        mapper = (v1, v2) -> null;
        favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Bus Tour, Sam=Skyride}

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);

        BiFunction<String, Integer, Integer> mapper1 = (k, v) -> v + 1;
        Integer jenny1 = counts.computeIfPresent("Jenny", mapper1);
        Integer sam1 = counts.computeIfPresent("Sam", mapper1);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny1); // 2
        System.out.println(sam1); // null

        counts = new HashMap<>();
        counts.put("Jenny", 15);
        counts.put("Tom", null);

        Function<String, Integer> mapper2 = (k) -> 1;
        Integer jenny2 = counts.computeIfAbsent("Jenny", mapper2); // 15
        Integer sam2 = counts.computeIfAbsent("Sam", mapper2); // 1
        Integer tom2 = counts.computeIfAbsent("Tom", mapper2); // 1
        System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}

        counts = new HashMap<>();
        counts.put("Jenny", 1);
        counts.computeIfPresent("Jenny", (k, v) -> null);
        counts.computeIfAbsent("Sam", k -> null);
        System.out.println(counts); // {}


    }
}
