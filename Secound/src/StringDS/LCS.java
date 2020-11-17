package StringDS;

public class LCS {

//	public static int lenghtoflogestSubString(String name) {
//
//		int left = 0, right = 0, max = 0;
//
//		Set<Character> cc = new HashSet<Character>();
//
//		while (right < name.length()) {
//			if (!cc.contains(name.charAt(right))) {
//				cc.add(name.charAt(right));
//				right++;
//				max = Math.max(max, cc.size());
//			} else {
//				cc.remove(name.charAt(left));
//				left++;
//			}
//		}
//		System.out.println(max);
//		return max;
//	}

	public static int lenghtoflogestSubString(String s) {
		int n = s.length(), ans = 0;
		int[] index = new int[128];

		for (int j = 0, i = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		String name = "acabcdac";
		lenghtoflogestSubString(name);
	}
}
