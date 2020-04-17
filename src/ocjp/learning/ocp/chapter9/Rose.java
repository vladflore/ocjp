package ocjp.learning.ocp.chapter9;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Rose {
	public static void main(String[] thorns) throws IOException {
//		new Rose().tendGarden(Paths.get(thorns[0]));

		System.out.println(Paths.get("./dir1/../dir2/").subpath(0, 2).resolve("m1.meteor").normalize());
		System.out.println(Paths.get("./dir1/../dir2/").subpath(0, 2));
		System.out.println(Paths.get("/dir1/../dir2/").subpath(0, 2));

		Files.notExists(Paths.get("."));

//		new URI("");
		URI.create("");

		Files.walkFileTree(Paths.get("."), new FileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				return null;
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				return null;
			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				return null;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				return null;
			}
		});
	}


	private void tendGarden(Path path) throws IOException {
		Files.walk(path, 1)
				.map(p -> {
					try {
						return p.toRealPath();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
					return p;
				})
				.forEach(System.out::print);
	}
}
