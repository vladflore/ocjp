package ocjp.learning.ocp.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("//home//vlad//vladflore.dev//sandbox//ocjp//file.txt");
		if (file.exists()) {
			System.out.println("there");
		}
//        FileInputStream fis = new FileInputStream(new File(""));
//        fis.read();
//        FileWriter fw = new FileWriter(new File(""), true);
//        RandomAccessFile raf = new RandomAccessFile("", "rws");
//        raf.seek(21);
//        System.setOut(new PrintStream(""));
//        System.in.read();
//        new BufferedReader(new FileReader(""));
//        new FileOutputStream(new File(""));

		boolean success = new File("info.txt").mkdirs();
		if (success) {
			System.out.println("folder created");
		}

		PrintWriter printWriter = new PrintWriter("");
		printWriter.print(5);
		printWriter.write("5");
		new PrintWriter(new File(""));

	}
}
