package hackerRank;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class myBook extends Book {
	int prise;

	public myBook(String title, String author, int prise) {
		super(title, author);
		this.prise = prise;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Auther: " + author);
		System.out.println("Prise: " + prise);
	}
}

public class Solution2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new myBook(title, author, price);
		book.display();
	}
}
