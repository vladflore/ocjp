package ocjp.learning;

import ocjp.learning.Koala;

public class KoalaTester {
	public static void main(String[] args) {
		Koala.main(new String[0]); // call static method

		Koala k = new Koala();
		System.out.println(k.count); // k is a ocjp.learning.Koala
		k = null;
		System.out.println(k.count);
	}
}