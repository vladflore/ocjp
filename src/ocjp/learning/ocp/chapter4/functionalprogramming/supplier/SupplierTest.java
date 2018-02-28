package ocjp.learning.ocp.chapter4.functionalprogramming.supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> s11 = StringBuilder::new;
        Supplier<StringBuilder> s22 = () -> new StringBuilder();

        System.out.println(s11.get());
        System.out.println(s22.get());

        Supplier<ArrayList<String>> s111 = ArrayList<String>::new;
        ArrayList<String> a1 = s111.get();
        System.out.println(a1);
    }
}
