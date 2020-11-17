package StringDS;

import java.util.Scanner;

public class Neon_Other {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// febbonacciSeies1(15);
		while (true) {
			System.out.println("\nEnter your choice:");
			System.out.println("\n1 Febbonacii series\n9 Exit");
			int n = Integer.parseInt(sc.nextLine());

			switch (n) {
			case 1:
				System.out.println("Enter Number:");
				int number = Integer.parseInt(sc.nextLine());
				febbonacciSeies(number);
				break;

			default:
				break;
			}
		}
	}

	public static void febbonacciSeies(int number) {

		int a = 1;
		int c = 1;
		int d = c + a;
		System.out.print(a + " " + c + " " + d + " ");
		int cxx = 3;
		do {
			a = c;
			c = d;
			d = a + c;
			System.out.print(d + " ");
			cxx++;
		} while (cxx < number);

	}

	public static void febbonacciSeies1(int number) {

	}
}
