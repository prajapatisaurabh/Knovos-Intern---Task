package arrays;

import java.util.Scanner;

public class ArrayMethod {
	public static void main(String[] args) {

		// Decimal to binary
		System.out.println(Integer.toBinaryString(155));
		System.out.println(Integer.toOctalString(155));
		System.out.println(Integer.toHexString(155));

		int[] arr = new int[50];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("Enter " + n + " elemet in array :");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println("Content of array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int position = 3;
		int value = 25;

		for (int i = n - 1; i >= position - 1; i--) {
			arr[i + 1] = arr[i];
		}
		arr[position - 1] = value;

		System.out.println("Content of array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
