package hackerRank;

import java.util.Scanner;

public class Solu {

	public static int hourGlass(int[][] anArray, int n, int o) {
		int result;
		result = anArray[n][o] + anArray[n][o + 1] + anArray[n][o + 2] + anArray[n + 1][o + 1] + anArray[n + 2][o]
				+ anArray[n + 2][o + 1] + anArray[n + 2][o + 2];
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int ans = 0, tempAns = -100000;
		for (int m = 0; m < 4; m++) {
			for (int o = 0; o < 4; o++) {
				ans = hourGlass(arr, m, o);
				if (ans > tempAns) {
					tempAns = ans;
				}
			}
		}

		if (ans >= tempAns) {
			System.out.println(ans);
		} else {
			System.out.println(tempAns);
		}
	}
}
