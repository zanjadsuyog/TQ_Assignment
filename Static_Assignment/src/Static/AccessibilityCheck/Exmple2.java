package AccessibilityCheck;

public class Exmple2 {

	// access static variable in static method.....
	    static int staticVariable = 10;
	    
	    public static void staticMethod() {
	        System.out.println("Static variable in static method: " + staticVariable);
	    }
	

	    public static void main(String[] args) {
	        System.out.println("Static variable: " + staticVariable);
	        Exmple2.staticMethod();
	    }

	   

}
