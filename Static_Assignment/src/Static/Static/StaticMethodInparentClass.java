package Static;

public class StaticMethodInparentClass {
	
    public static void staticMethod() {
        System.out.println("This is a static method in ParentClass");
    }
}

class ChildClass extends StaticMethodInparentClass {
    public static void main(String[] args) {
        staticMethod();             // Output: This is a static method in ParentClass
        staticMethod(); // Output: This is a static method in ParentClass
    }
}
