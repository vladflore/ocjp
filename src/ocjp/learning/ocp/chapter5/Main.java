package ocjp.learning.ocp.chapter5;

import java.time.Period;
import java.util.Enumeration;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		Period period = Period.ofDays(2).ofYears(3);
		System.out.println(period);

		Properties properties = new Properties();
		Enumeration<Object> keys = properties.keys();


	}
}
