package com.demo;

import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);

	public static void getBookDetails(Book b) {
		System.out.println("Enter id:");
		b.setId(sc.nextInt());

		System.out.println("Enter Name:");
		b.setName(sc.next());

		System.out.println("Enter price:");
		b.setPrice(sc.nextFloat());
	
		b.setA(new Author());
		System.out.println("Enter Author id:");
		b.getA().setAid((sc.nextInt()));

		System.out.println("Enter Author name:");
		b.getA().setAname((sc.next()));
	}

	public static void main (String[] suyog) {

		Book b1[] = new Book[3];
		b1[0] = new Book();
		b1[1] = new Book();
		
		getBookDetails(b1[0]);
		System.out.println(b1[0]);
	}

}
