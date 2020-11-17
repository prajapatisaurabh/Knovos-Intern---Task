package zeta;

class Examp {
	public int a;

	public Examp() {
		this.a = 10; // Line 1
	}

	public void print() {
		System.out.println(a);
	}

	public static Examp set() {
		return new Examp(); // Line 2
	}
}

public class Examp4 {

	public static void main(String[] args) {
		Examp pp = new Examp().set();
		pp.print();

	}

}
