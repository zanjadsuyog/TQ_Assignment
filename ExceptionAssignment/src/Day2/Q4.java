package Day2;

public class Q4 {
// WAP to check whether Unchecked Exception is propagated in calling stack
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			System.out.println("Caught exception: " + e);
		}
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		method3();
	}

	private static void method3() {
		throw new RuntimeException("Unchecked exception thrown from method3");
	}

}
