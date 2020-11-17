package StringDS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		// Date conversion Util to SQL
		Date utildate = new Date();
		System.out.println(utildate);
		java.sql.Date d = convert(utildate);
		System.out.println("sql date  : " + d);
		DateFormat dfd = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
		System.out.println(dfd.format(utildate));
	}

	public static java.sql.Date convert(Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}
}
