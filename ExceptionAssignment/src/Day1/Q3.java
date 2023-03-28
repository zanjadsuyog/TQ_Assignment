package Day1;

public class Q3 {

	// WAP to catch multiple exceptions.
	// i.e ArrayIndexOutOfBoundsException and ArithmeticException

	public static void main(String[] args) {
		int a[] = new int[5];

	/*	try {

			System.out.println(a[5]);

			int result = 1 / 0;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught a arrayindexoutofBoundexception: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Caught a Arithematicexception: " + e.getMessage());

		}
		*/
		
		try {
			
		
			int result=2/0;

		} catch (ArithmeticException e) {

		System.out.println("Arithematicexception: "+e.getMessage());
		}
		
		
	}
}
