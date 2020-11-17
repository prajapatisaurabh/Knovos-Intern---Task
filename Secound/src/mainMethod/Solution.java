package mainMethod;

//PermGen - Metaspace
// < > - = ! ( ) [ ] { } \ ^ $ | ? * + .
public class Solution {
	public static void main(String[] args) {

		String arr[] = { "sa", "sp", "sc" };

		String newStr = String.join(" + ", arr);
		System.out.println(newStr);

//		String a[] = "a.b.c.d.e.f.g.h".split(".");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
	}
}