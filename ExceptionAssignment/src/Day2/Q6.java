package Day2;


//	WAP to check Exception handling with method overriding. Means, If super class method don’t
//	declare exception then subclass overridden method can declare exception or not.
	class Superclass {
	    public void doSomething() {
	        // Superclass implementation
	    }
	}

	class Subclass extends Superclass {
	    @Override
	    public void doSomething() throws RuntimeException {
	        // Subclass implementation that throws a runtime exception
	    }
	}

	public class Q6 {
	    public static void main(String[] args) {
	        Superclass obj = new Subclass();
	        obj.doSomething();
	    }
	}

