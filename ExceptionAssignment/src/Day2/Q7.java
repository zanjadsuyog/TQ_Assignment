package Day2;

public class Q7 {
//WAP to show throw and throws keyword.
	

	    public static void main(String[] args) {
	        try {
	            throw new Exception("This is an example exception");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            doSomething();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void doSomething() throws Exception {
	        throw new Exception("This is another example exception");
	    }
	
}
