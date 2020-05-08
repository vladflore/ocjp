package ocjp.learning.ocp.chapter5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

public class Main {
	private static Instant instant;

	public static void main(String[] args) {
		// Period period = Period.ofDays(2).ofYears(3);
		// System.out.println(period);

		// System.out.println(Duration.ofDays(2).ofHours(3));

		// Properties properties = new Properties();
		// Enumeration<Object> keys = properties.keys();

		// LocalDateTime ldt = LocalDateTime.of(LocalDate.of(2020, 4, 22),
		// LocalTime.of(22, 19));
		// Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
		// System.out.println(instant);

		// LocalTime lt = LocalTime.of(1, 00, 00);
		// LocalTime ldt1 = lt.of(1, 00);

		// System.out.println(Duration.between(LocalTime.MIDNIGHT,
		// LocalTime.NOON).get(ChronoUnit.MINUTES));

		// Instant inst = Instant.now().plus(5, ChronoUnit.YEARS);
		// System.out.println(inst);

		// LocalDate d1 = LocalDate.of(2017, Month.NOVEMBER, 28);
		// System.out.print(d1 + ", ");
		// LocalDate d2 = d1.with(TemporalAdjusters.lastDayOfYear());
		// System.out.print(d2 + ", ");
		// System.out.println(d1.plusDays(3));
		// LocalDate d3 = d1.plusDays(3).with(TemporalAdjusters.firstDayOfNextMonth());
		// System.out.print(d3 + ", ");

		LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0); // Jun 2nd, 6AM.
		ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
		ZoneId nyZone = ZoneId.of("America/New_York");

		OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
		System.out.println(nyOdt);

		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		System.out.println(nyZdt);

		Duration d = Duration.between(nyOdt, nyZdt);

		System.out.println(d);

		// ------------------------------------------------------------------

		LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

		ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Duration.ofDays(1));
		System.out.println(date);

		date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
		date = date.plus(Period.ofDays(1));
		System.out.println(date);

		// -------------------------------------------------------------------

		LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
		ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		System.out.println(zd1);

		LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
		ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
		System.out.println(zd2);

		long x = ChronoUnit.HOURS.between(zd1, zd2);
		System.out.println(x);

		// -----------
		Instant inst = Instant.now().truncatedTo(ChronoUnit.HOURS);
		System.out.println(inst);

	}
}
