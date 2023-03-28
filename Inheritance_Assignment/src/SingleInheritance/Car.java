package SingleInheritance;

public class Car {

	int price;

	public void method1(int price) {
		System.out.println("I am yashank");
		System.out.println(price);
		System.out.println("*********************************");
	}

}

class racingcar extends Car {
	String name;

	public void method2(String name) {
		System.out.println(name);
		System.out.println("I am vivek");
		System.out.println("*********************************");

	}
}

class Gauravchicar extends Car {
	double price;

	public void method3(double price) {
		System.out.println(price);
		System.out.println("I am Gaurav");
		System.out.println("*********************************");

	}
}
