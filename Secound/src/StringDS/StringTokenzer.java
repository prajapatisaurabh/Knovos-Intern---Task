package StringDS;

import java.util.StringTokenizer;

public class StringTokenzer {
	public static void main(String[] args) {
		StringTokenizer tk = new StringTokenizer("apple ball cat dog", " ");
		while (tk.hasMoreElements()) {
			System.out.println(tk.nextElement());
		}
	}
}
