5package Assignment;

import java.util.Scanner;

public class PrintTablesingArray{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int[] table = new int[10]; // create an array of size 10
		for (int i = 1; i <= 10; i++) {
			table[i - 1] = num * i; // add table of number in array
		}
		System.out.println("Table of " + num + ":");
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " x " + (i + 1) + " = " + table[i]); // display array
		}
	}


}
