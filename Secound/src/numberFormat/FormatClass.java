package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatClass {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "IN");
		System.out.println(locale);
		NumberFormat format = NumberFormat.getInstance(locale);
		System.out.println(format.format(1000000.99));

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(numberFormat.format(10333.66));

		System.out.println(format);
	}
}
