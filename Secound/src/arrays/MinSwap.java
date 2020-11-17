
package arrays;

public class MinSwap {
	static int minimumSwaps(int[] arr) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i + 1)
				continue;
			temp++;
			int tmp = arr[i];
			arr[i] = arr[i + 1];
			arr[tmp - 1] = tmp;
			i--;

		}

		return temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 4, 6, 7 };
		minimumSwaps(arr);
	}
}
