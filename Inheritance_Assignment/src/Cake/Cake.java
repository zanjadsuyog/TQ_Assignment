package Cake;

 class Cake {

// Create interface Cake with a method declared as bake. 
// Create 2 classes
// Strawberry, BlackForest both implementing Cake interface.

	void bake() {
		System.out.println("Bake..........");
	}

	class Strawberry extends Cake {
		void display() {
			System.out.println("strawbrry....");
		}
	}

public	class Blackfrrest extends Cake {
		void display() {
			System.out.println("strawbrry....");
		}
	}
	
	
}