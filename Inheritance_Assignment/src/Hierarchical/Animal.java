package Hierarchical;

public class Animal {

	void eat() {
		System.out.println("Eating........");
	}
}

class dog extends Animal {

	void bark() {
		System.out.println("barking.......");
	}
}

 class Cat extends dog {

	void voice() {
		System.out.println("Maouwwwwww........");
	}
}
