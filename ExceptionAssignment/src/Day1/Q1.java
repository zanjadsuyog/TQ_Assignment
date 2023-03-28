package Day1;

public class Q1 {

//	WAP which throws ArrayIndexOutBoundsException.
//  In the console, observe the stack trace and the
//	line number from where the Exception is thrown

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers[3]);
		// accessing index 3, which is out of bounds
	}
}
