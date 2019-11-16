package ocjp.learning.ocp.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {
        GenericMethod.<String>ship("string");


        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        List<Object> objects = Collections.singletonList(integers);
//        List<Object> objects = integers;
//        objects.add("string");
        System.out.println(integers.get(0).getClass());
        System.out.println(objects.get(0).getClass());

//        List<?> list = new ArrayList<>();
//        list.add("string");

        print(integers);
        print(objects);


        List<Integer> l = new ArrayList<>();
        l.add(5);
        System.out.println(sum(l));


        // with upper bound and unbounded wildcards the list becomes logically immutable
        List<? extends Bird> birds = new ArrayList<Sparrow>();
//        birds.add(new Bird());
//        birds.add(new Sparrow());


    }

    static long sum(List<? extends Number> list) {
        return 0;
    }

    static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    /*
    <T> formal type parameter
    Crate<T> return type
    T generic type
     */

    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}

class Bird {
}

class Sparrow extends Bird {
}
