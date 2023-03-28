package Day1;

public class Q5 {

	public static void main(String[] args) {
//	In this example, the program simply prints out a message in both the try and finally blocks. The try block is executed first, followed by the finally block, regardless of whether an exception is thrown or not.

//	If an exception is thrown in the try block, the finally block will still be executed. This is useful for cleaning up resources or performing other tasks that should always be done, regardless of whether an exception occurs.
	
	 // q write program try and finnaly are used
		
		try {
			System.out.println("Try block are executed....");
			
		} 
		finally {

			System.out.println("Finally block are executed ....");
		}
	}

}
