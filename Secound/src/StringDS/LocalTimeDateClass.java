package StringDS;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LocalTimeDateClass {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		ldate = LocalDate.of(2017, 12, 15);
		System.out.println(ldate);
		ldate = LocalDate.parse("2017-12-15");
		ZoneId zen = ZoneId.systemDefault();
		System.out.println(zen);

		Calendar obj = Calendar.getInstance();
		obj.set(1974, 6, 2, 8, 2, 0);
		// System.out.println(obj);

		Date d = obj.getTime();
		System.out.println(d);
	}
}
