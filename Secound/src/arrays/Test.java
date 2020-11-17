package arrays;

public class Test {
	public static void main(String args[]) {
		for (int i = 5; i >= 1; i--) {
			int k = 5;
			for (int j = i; j >= 1; j--) {
				if (k == 5 || k == 3 || k == 1) {
					System.out.print(k);
				} else if (k == 4) {
					System.out.print("**");
				} else {
					System.out.print("*");
				}
				k--;
			}
			// forgot this line
			System.out.println();
		}
	}
}