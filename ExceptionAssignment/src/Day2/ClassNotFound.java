package Day2;

public class ClassNotFound {

	public static void main(String[] args) {
		try {
			// Attempt to load a class that doesn't exist
			Class.forName("com.example.NonExistentClass");
		} catch (ClassNotFoundException e) {
			// Handle the ClassNotFoundException
			System.out.println("Class not found: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
