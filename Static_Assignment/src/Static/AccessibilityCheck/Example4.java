package AccessibilityCheck;

public class Example4 {

	int marks=89;
	
	void display()
	{
		System.out.println("access non static var in non static method=>"+marks);
	}
	public static void main(String[] args) {

	//	non static variable in non-static method 
		
		Example4 example4=new Example4();
		example4.display();
	}

}
