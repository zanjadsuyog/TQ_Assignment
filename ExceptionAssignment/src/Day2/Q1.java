package Day2;

public class Q1 {

//	WAP to return int value in try block and return int 
//  value in finally block and observe which return	takes precedence

	public static int returnintvalue() {
		try {

			return 10;
		} 
		catch (Exception e) {

			return 20;
		} 
		finally {
			return 30;
		}

	}

	public static void main(String[] args) {

		int result = returnintvalue();

		System.out.println("Return Block: " + result);
	}
}
