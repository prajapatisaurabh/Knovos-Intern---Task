package StringDS;

import java.util.Formatter;
import java.util.StringJoiner;

public class CompringStrClass {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		StringBuffer bf = new StringBuffer();
		// This is Thread Safe
		StringBuilder bb = new StringBuilder();
		// this is not Thread safe
		StringJoiner join = new StringJoiner("");
	}
}
