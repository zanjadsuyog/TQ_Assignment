package Day1;

public class Q9 {

//	WAP to show 3 different scenario in which null pointer exceptions generated, 
//	and handle that exception.

	public static void main(String[] args) {

		// Scenario 1: Accessing a null object
		String s = null;
		try {
			int length = s.length();
			System.out.println("Length of string: " + length);
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException!");
			e.printStackTrace();
		}

		// Scenario 2: Accessing a null element in an array
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			arr = null;
			int element = arr[0];
			System.out.println("Element at index 0: " + element);
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException!");
			e.printStackTrace();
		}

		// Scenario 3: Calling a null method
		Q9 obj = null;
		try {
			obj.someMethod();
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException!");
			e.printStackTrace();
		}
	}

	public void someMethod() {
		System.out.println("Inside someMethod");
	}

}
