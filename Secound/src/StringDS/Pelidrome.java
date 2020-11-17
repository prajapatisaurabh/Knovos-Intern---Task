package StringDS;

public class Pelidrome {
	public static void main(String[] args) {
		String s = "taeat";
		String s1 = new StringBuffer(s).reverse().toString();
		System.out.println(s + " " + s1);
		if (s.equalsIgnoreCase(s1)) {
			System.out.println("Yes");
		} else {
			System.out.println("not");
		}
	}
}
