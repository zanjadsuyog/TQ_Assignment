package Day2;

public class Q2 {

//  WAP to return int value in try and return int value in
//	finally and see finally takes precedence.

	public static int checkthereturnvalue() {
		int a = 5;

		try {
			a = a + 5;

			return a;
		} 
		finally {
			a += 50;
			System.out.println("Finnaly block executed");
			return a;
		}

	}

	public static void main(String[] args) {

		int result = checkthereturnvalue();
		System.out.println("Result: " + result);
	}
}
