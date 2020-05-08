package ocjp.learning.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Comparator<Integer> c = (x, y) -> y - x;
        List<Integer> ints = Arrays.asList(3, 1, 4);
        Collections.sort(ints, c);
        System.out.println(ints);

        List<? extends Number> l = new ArrayList<Integer>();
        
    }

}