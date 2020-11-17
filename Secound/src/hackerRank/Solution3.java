package hackerRank;

import java.util.Arrays;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int arr[]) {
		this.elements = arr;
	}

	public int computeDifference() {
		Arrays.sort(elements);
		maximumDifference = elements[elements.length - 1] - elements[0];
		return maximumDifference;
	}

}

public class Solution3 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 2, 8, 4, 2, 100, 7, 9, 5, 6, 87, 9, 5, 8, 9, 5, 8, 7, 5, 9, 6, 8, 9, 5, 9, 8, 5, 96, 5, 9,
				5, 9 };

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}