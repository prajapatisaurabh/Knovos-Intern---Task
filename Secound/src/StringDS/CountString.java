package StringDS;

import java.util.regex.Pattern;

public class CountString {

	public static int countStringInstring(String match, String text) {
		Pattern p = Pattern.compile(match);
		CharSequence cs = text;
		System.out.println(Pattern.matches(match, cs));

		return 0;
	}

	public static void main(String[] args) {
		String text = "One fish, two fish, red fish, blue fish";
		System.out.println(countStringInstring("fish", text));
	}
}
