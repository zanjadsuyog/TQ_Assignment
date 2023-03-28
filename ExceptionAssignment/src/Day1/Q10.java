package Day1;

public class Q10 {

//	WAP to throw exception still finally should get executed

	public static void main(String[] args) {

		try {
			int a = 10 / 0;

		} catch (ArithmeticException e) {

			System.out.println("ArithemeticException ");
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally block always executed ....");
		}
	}
}
