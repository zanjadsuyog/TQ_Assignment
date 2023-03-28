package Day2;


public class ThrowingExample {

	public static void getdata() {
		try {
			int a = 100 / 2;
			System.out.println("A:" + a);
		} catch (Exception e) {

			throw e;
		}
	}

	public static void getdata1() {
		try {
			int a = 100 / 2;
			System.out.println("A:" + a);
		} catch (Exception e) {

			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
			getdata();
			getdata1();
		} catch (Exception e) {

			System.out.println("handle in main method");
		}
		}
}
