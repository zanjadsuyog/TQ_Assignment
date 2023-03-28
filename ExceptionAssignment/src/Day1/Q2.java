package Day1;

public class Q2 {

	public static void main(String[] args) {

// WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
	
		int a[]=new int[3];
		
		try {
			
			System.out.println(a[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			
          System.out.println("Caught an ArrayIndexOutOfBoundsException: "+e.getMessage());
		}
		
		System.out.println("Program ready to run...........");
		
	}

}
