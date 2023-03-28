package Multilevel_Inheritace;

public class Animal {

	void eat() {
		System.out.println("eating......");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog {
	void sleep() {
		System.out.println("sleeping...");
	}
}
