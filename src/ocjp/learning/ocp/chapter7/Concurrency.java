package ocjp.learning.ocp.chapter7;

import java.util.Arrays;

public class Concurrency {
    public static void main(final String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().reduce(0, (a, b) -> a - b));
        System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("x", String::concat));

        System.out.println(
            Arrays.asList("abc","def")
            .parallelStream()
            .parallel()
            .reduce(0, (c1,c2) -> c1.length() + c2.length(), (s1,s2) -> s1+s2)
        );    
    }
}