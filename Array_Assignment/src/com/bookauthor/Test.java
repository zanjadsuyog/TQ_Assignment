package com.bookauthor;

import java.util.Scanner;

public class Test {

	public static void display(Book book[]) {
		
		for (int i = 0; i < book.length; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the book details: ");
			System.out.println("ID : ");
			int id = sc.nextInt();

			System.out.println("Name: ");
			String Bookname = sc.next();

			System.out.println("Price: ");
			float price = sc.nextFloat();

			System.out.println("Author Id: ");
			int aid = sc.nextInt();

			System.out.println("Author Name: ");
			String Authorname = sc.next();

			Author author = new Author(aid, Authorname);

			Book books2 = new Book(aid, Bookname, price, author);

			book[i] = books2;
			for (Book bk : book) {

				System.out.println(bk);
			}
		}
	}

	public static void main(String[] args) {

		Book[] book1 = new Book[2];

		display(book1);

	}

}
