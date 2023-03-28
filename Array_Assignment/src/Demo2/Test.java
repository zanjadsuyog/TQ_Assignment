package Demo2;

import java.util.Scanner;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void display(Book b) {
		System.out.println("Enter the book id:");
		b.setId(sc.nextInt());

		System.out.println("Enter the Book Name: ");
		b.setName(sc.next());

		System.out.println("Enter the Price: ");
		b.setPrice(sc.nextFloat());

		System.out.println("Enter the Author id: ");
		b.setAuthor(new Author());
		b.getAuthor().setId(sc.nextInt());

		System.out.println("Enter the Author Name: ");
		b.getAuthor().setName(sc.next());

	}

	public static void main(String[] args) {

		Book[] b1 = new Book[3];

		for (int i = 0; i <= 2; i++) {
			b1[i] = new Book();
			display(b1[i]);
			System.out.println(b1[i]);
			System.out.println("_________________");
		}
	}
}
