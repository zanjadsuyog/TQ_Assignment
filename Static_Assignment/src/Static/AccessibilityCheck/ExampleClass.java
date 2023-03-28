package AccessibilityCheck;

public class ExampleClass {

//	Static variable and Non-Static (Instance Variable) – Just declare and print it.

	static int staticVariable = 10;
	int instanceVariable = 20;

	public static void main(String[] args) {
		System.out.println("Static variable: " + staticVariable);

		ExampleClass example = new ExampleClass();
		System.out.println("Instance variable: " + example.instanceVariable);

	}

}
