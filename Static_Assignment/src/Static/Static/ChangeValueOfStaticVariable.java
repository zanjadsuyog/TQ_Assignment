package Static;

public class ChangeValueOfStaticVariable {

//	3.	Create two object of Car class and change value of static 
//  variable by 1st object and print it by accessing 2nd object.
		
		
		    String model;
		    static int totalCarSold;

		    public ChangeValueOfStaticVariable(String model) {
		        this.model = model;
		        totalCarSold++;
		    }

		    public static void main(String[] args) {
		        Car car1 = new Car("Toyota");
		        Car car2 = new Car("Honda");

		        System.out.println("Total cars sold: " + Car.totalCarSold); // Output: Total cars sold: 2

		        car1.totalCarSold++;

		        System.out.println("Total cars sold: " + car2.totalCarSold); // Output: Total cars sold: 3
		    }
		
}
