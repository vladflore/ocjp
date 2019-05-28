package ocjp.learning.oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Chapter9 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("123");

    sb.append("456").insert(6, "789");
    System.out.println(sb.toString());

    System.out.println(sb.reverse());

    List<String> list = new ArrayList<>(1);
    // list = new List();
    // list = (List) new Object();
    list.add("Flore");
    list.add("Tiriac");
    System.out.println(list.remove(0));
    System.out.println(list);

    Predicate<StringBuilder> p = (StringBuilder b) -> true;

    String str = "Flore";
    LocalDate date = LocalDate.now();

    List l = new ArrayList<>();

    // String str = 'c';
    String str1 = Character.toString('c');
    String str2 = String.valueOf('c');

    String str3 = "Flore";
    System.out.println(str.replace(new StringBuilder("ore"), new String("oare")));

    LocalDate ld = LocalDate.now();
    ld.plusDays(-1);
    ld.minusDays(-1);

  }
}