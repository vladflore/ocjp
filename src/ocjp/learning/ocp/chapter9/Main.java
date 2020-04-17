package ocjp.learning.ocp.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try {

			final Path path = Paths.get(".").normalize();
			System.out.println(path.getNameCount());
			System.out.println(path.toAbsolutePath().getNameCount());
			System.out.println(path.toAbsolutePath().toString());



			Files.lines(Paths.get("csv.csv"))
					.flatMap(p -> Stream.of(p.split(",")))
					.map(String::toUpperCase)
					.forEach(System.out::print);

			Files.move(
					Paths.get("monkey.txt"),
					Paths.get("animals"),
					StandardCopyOption.ATOMIC_MOVE, LinkOption.NOFOLLOW_LINKS);


			Path path1 = Paths.get("goat.txt");
			Path path2 = Paths.get("goat1.txt");
			Files.copy(
					path1,
					path2,
					StandardCopyOption.COPY_ATTRIBUTES);
			System.out.println(Files.isSameFile(path1, path2));


		}
		catch (IOException ex) {

		}
	}
}
