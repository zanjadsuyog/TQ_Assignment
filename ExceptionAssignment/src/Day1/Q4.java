package Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {

// WAP to show checked exception and use
// multiple catch block with universal Exception handler.

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("file.txt"); // this might throw FileNotFoundException
			BufferedReader reader = new BufferedReader(file);
			String line = reader.readLine(); // this might throw IOException
			System.out.println("Read line from file: " + line);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught an exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}
		System.out.println("Program continues...");
	}
}
