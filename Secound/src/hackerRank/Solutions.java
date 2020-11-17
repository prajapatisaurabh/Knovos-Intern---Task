package hackerRank;

class Text {
	int num;
	String name;

	public Text(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + this.num;
	}
}

class Solutions {
	public static void main(String args[]) {
		Text t = new Text(123, "Saurabh");
		String s = "Hello, World!";
		System.out.println(s.length());
		System.out.println(s.codePointCount(0, s.length()));
		System.out.println(s.codePoints().count());
	}
}
