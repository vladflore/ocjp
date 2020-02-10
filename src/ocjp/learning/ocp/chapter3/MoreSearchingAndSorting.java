package ocjp.learning.ocp.chapter3;

import java.util.*;

public class MoreSearchingAndSorting {

    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        // the Rabbits must be Comparable
//        Collections.sort(rabbits);
        Collections.sort(rabbits, Comparator.comparingInt(r -> r.id));


        List<String> names = Arrays.asList("gg", "ee", "cc", "aa");
        int bbb = Collections.binarySearch(names, "dd", Comparator.reverseOrder());
        System.out.println(bbb);

        System.out.println(names);
    }

}
