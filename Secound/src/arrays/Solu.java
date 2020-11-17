package arrays;

import java.io.IOException;
import java.util.Scanner;

public class Solu {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();

			for (int j = 0; j < str.length(); j++) {
				if (j % 2 == 0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.print(" ");
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 != 0) {
					System.out.print(str.charAt(j));
				}
			}

		}

//		long result = Integer.MIN_VALUE;
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		long arr[] = new long[n + 1];
//		for (int i = 0; i < m; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int k = sc.nextInt();
//			arr[a] += k;
//			if ((b + 1) <= n)
//				arr[b + 1] -= k;
//		}
//		long sum = 0;
//		for (int i = 0; i <= n; i++) {
//			sum += arr[i];
//			if (sum >= result)
//				result = sum;
//		}
//		System.out.println(result);
	}
}