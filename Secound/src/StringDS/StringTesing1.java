package StringDS;

public class StringTesing1 {

	public static void removeDuplicate(String name) {
		char[] arr = name.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("i :" + arr[i]);
					System.out.print("j: " + arr[j]);
				}
			}
		}

	}

	public static void main(String[] args) {
		String name = "abcabc";
//		char[] arr = name.toCharArray();
//
//		LinkedHashSet<Character> cc = new LinkedHashSet<Character>();
//
//		for (int i = 0; i < arr.length; i++) {
//			cc.add(arr[i]);
//		}
//
//		for (Character character : cc) {
//			System.out.print(character);
//		}

		removeDuplicate(name);

	}
}
