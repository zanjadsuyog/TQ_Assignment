package Day1;

public class Q8 {

//	WAP to show the scenario in which IndexOutBound Exception 
//	(Both ArrayInexOutOfBound and StringIndexOutOfBound)
//	exception is generated and handle this exception.

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7 };

		try {

			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("arrayindexoutofboundexception: " + e.getMessage());
		}
	}

	String str = ("hellow");
	{
		try {
			System.out.println(str.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("StringIndexOutOfBound occured" + e.getMessage());
		}

	}
}
