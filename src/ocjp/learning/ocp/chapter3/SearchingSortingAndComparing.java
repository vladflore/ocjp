package ocjp.learning.ocp.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaCollectionsFramework {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Vlad", 34),
                new Person("Ioana", 30),
                new Person("John", 35),
                new Person("Jack", 35));
        Collections.sort(people);
        System.out.println(people);

        Comparator<Person> byName = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(people, byName);
        System.out.println(people);

        Comparator<Person> byNameWithLambda = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Collections.sort(people, byNameWithLambda);
        System.out.println(people);

        Comparator<Person> byNameWithLambda1 = Comparator.comparing(Person::getName);
        Collections.sort(people, byNameWithLambda1);
        System.out.println(people);

        Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        System.out.println(people);

    }
}


class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}
