package ocjp.learning.features;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Snippet {

    private static long counter;

    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) throws IOException {

        Optional<String> optStr = Optional.ofNullable("vlad");
        System.out.println(optStr.orElse("value not present"));

        System.out.println(optStr.get().equalsIgnoreCase("vlad"));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list.stream().filter(v -> v % 2 != 0).count());
        System.out.println(list);


//        Map<String, List<String>> people = new HashMap<>();
//        people.put("John", Arrays.asList("555-1123", "555-3389"));
//        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
//        people.put("Steve", Arrays.asList("555-6654", "555-3242"));
//
//        List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(phones);
//
//        Stream<String> streamEmpty = Stream.empty();
//
//        Stream<String> streamOfList = streamOf(Arrays.asList("", ""));
//        System.out.println(streamOfList.count());
//
//        Collection<String> collection = Arrays.asList("a", "b", "c");
//        Stream<String> streamOfCollection = collection.stream();
//        System.out.println(streamOfCollection.count());
//
//        Stream<String> streamOfArray = Stream.of("a", "b", "c");
//
//        String[] arr = new String[]{"a", "b", "c"};
//        Stream<String> streamOfArrayFull = Arrays.stream(arr);
//        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
//        streamOfArrayPart.forEach(e -> System.out.println(e));
//
//        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
//
//        // should specify the desired size or the generate() method will work until it
//        // reaches the memory limit
//        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
//        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
//
//        IntStream intStream = IntStream.range(1, 3);
//        LongStream longStream = LongStream.rangeClosed(1, 3);
//
//        Random random = new Random();
//        DoubleStream doubleStream = random.doubles(3);
//
//        IntStream streamOfChars = "abc".chars();
//        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");
//
//        Path path = Paths.get("file.txt");
//        Stream<String> streamOfStrings = Files.lines(path);
//        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
//
//        Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
//        Optional<String> anyElement = stream.findAny();
//        // will throw an error
//        // Optional<String> firstElement = stream.findFirst();
//
//        List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
//                .collect(Collectors.toList());
//        anyElement = elements.stream().findAny();
//        Optional<String> firstElement = elements.stream().findFirst();
//
//        // Stream<String> twiceModifiedStream = stream.skip(1).map(element ->
//        // element.substring(0, 3));
//
//        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
//        long size = list.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();
//
//        List<String> list1 = Arrays.asList("abc1", "abc2", "abc3");
//        counter = 0;
//        Stream<String> stream1 = list1.stream().filter(element -> {
//            wasCalled();
//            return element.contains("2");
//        });
//        System.out.println(counter);
//
//        Optional<String> stream2 = list.stream().filter(element -> {
//            System.out.println("filter() was called");
//            return element.contains("2");
//        }).map(element -> {
//            System.out.println("map() was called");
//            return element.toUpperCase();
//        }).findFirst();
//        System.out.println(stream2.get());

    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}