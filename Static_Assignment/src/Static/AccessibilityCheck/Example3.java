package AccessibilityCheck;

public class Example3 {
	
	private int var=30;
	//	non static variable in static method
	
	/* In Java, you cannot access a non-static variable from 
	 * within a static method. This is because a static method is
	 *  associated with the class itself, while non-static variables
	 *   are associated with individual instances of the class.
	 */

	public static void display()
	{
	//	System.out.println("Non static variable=>"+var);
	}
	public static void main(String[] args) {
		
		Example3 e3=new Example3();
		
	}

}
