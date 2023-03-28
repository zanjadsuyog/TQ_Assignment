package Kid;

public class Kid {
//	WAP to create a class Kid with method readBook() and 
//  another method readBook () with 2
//	parameters. The method readBook here is over-loaded 
	// (same method name but different
//	parameters) Create a class BigKid which extends Kid created above.
	// Implement readBook() differently in
//	BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

	protected int id;
	protected String name;
	
	void readBook() {

	}

	void readBook(int id, String name) {
		System.out.println("I am Kid Class...");
		
	}
}
