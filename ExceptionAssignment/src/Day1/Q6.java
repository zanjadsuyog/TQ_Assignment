package Day1;

public class Q6 {

//	This results in an ArithmeticException,
//	which is an example of an unchecked exception.

//	WAP to show unchecked exception
	
	public static void main(String[] args) {

		int a=10;
		int b=0;
		int c=a/b;    // Divide by zero error
		System.out.println(c);
	}

}
