package Day2;

import java.util.Scanner;

public class Nuberformat {

//	WAP to show the scenario in which number-format exception is generated and handle this
//	exception.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = scanner.nextLine();

		try {
			int number = Integer.parseInt(input);
			System.out.println("The number you entered is: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input. Please enter a valid number.");
		}
	}

}
