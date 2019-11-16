package ocjp.learning.ocp.chapter3;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);

        //    List<?> list = new ArrayList<? extends A>();
    }

    static void addSound(List<? super String> list) {
        list.add("quack");

    }

    static <T> T m2(List<? extends T> list) {
        return list.get(0);
    }

    // the return type is not actually a type
//    static <T> <? extends T> m3(List<? extends T> list) {
//        return list.get(0);
//    }

    // type parameter hides visible type B
    <B extends A> B m3(List<B> list) {
        return new B(); // type parameter cannot be instantiated correctly
    }

    <X> void m4(List<X extends B> list) {

    }

}

class A {
}

class B extends A {
}

class C extends B {
}
