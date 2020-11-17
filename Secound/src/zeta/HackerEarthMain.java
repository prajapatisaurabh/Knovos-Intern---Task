package zeta;

class HackerEarth {
	public String str = "Java";

	public static void print() {
		System.out.println("Inside HackerEarth");
	}
}

class Hacker extends HackerEarth {
	public String str = "Scala";

	public static void print() {
		System.out.println("Inside Hacker");
	}
}

public class HackerEarthMain {
	public static void main(String[] args) {
		HackerEarth o1 = new HackerEarth();
		Hacker o2 = new Hacker();

		System.out.println(((HackerEarth) o2).str);

		((Hacker) o1).print();
	}
}
