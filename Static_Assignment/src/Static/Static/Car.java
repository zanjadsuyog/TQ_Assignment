package Static;

public class Car {
	
//	Create a class Car with String model and 
//  inttotalCarSold as static variable in main() method.
	String model;
	static int totalCarSold;

	public Car(String model) {
		this.model = model;
		totalCarSold++;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Toyota");
		Car car2 = new Car("Honda");

		System.out.println("Total cars sold: " + Car.totalCarSold); // Output: Total cars sold: 2
	}

}
