package ocjp.learning.ocp.chapter4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FunctionalProgramming {
	public static void main(String[] args) {

		// Collector<String, ?, Optional<Character>> mapping = Collectors.mapping(s ->
		// s.charAt(0),
		// Collectors.maxBy(Comparator.naturalOrder()));

		// Map<Integer, Optional<Character>> collect = Stream.of("a", "aa", "b", "bb",
		// "c", "ddd")
		// .collect(Collectors.groupingBy(String::length, mapping));
		// System.out.println(collect);

		Stream<String> s = Stream.of("a", "b");

		s.sorted(Comparator.reverseOrder()).forEach(System.out::print);
		// s.sorted(Collections.reverseOrder()).forEach(System.out::print);
		// Collections.reverseOrder();

		// s.sorted(Comparator::reverseOrder).forEach(System.out::print);

		Collectors.joining();
		Collectors.joining(", ");

		if (null == null) {
			System.out.println("null is null");
		}

		LongStream stream = LongStream.of(9);
		stream.mapToInt(p -> (int) p).forEach(System.out::print);

		Stream.of(Arrays.asList(1, 2), new HashSet<>(), new ArrayDeque<>(Arrays.asList(3, 4)))
				.flatMap(Collection::stream)
				.forEach(System.out::print);

		Integer integer = Stream.of(new Ballot("vlad", 10), new Ballot("flore", -1), new Ballot("vlad", 5))
				.collect(Collectors.groupingBy(Ballot::getName, Collectors.summingInt(Ballot::getScore)))
				.get("flore");
		System.out.println(integer);

		Stream<String> stringStream = Stream.of("ab", "bc", "cde", "def");
		Map<Integer, Optional<Character>> collect = stringStream.collect(
				Collectors.groupingBy(
						String::length,
						Collectors.mapping((String s1) -> s1.charAt(0), Collectors.minBy(Comparator.naturalOrder()))
				)
		);
		System.out.println(collect);
	}


	static class Ballot {
		private String name;

		private int score;

		public Ballot(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public int getScore() {
			return score;
		}
	}

}
