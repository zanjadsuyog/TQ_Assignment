package Static;

//	WAP to check whether you can inherit static variable of Parent 
//  class in Child class

public class ParentClass {
	public static int staticVar = 42;
}

class ChildClass extends ParentClass {
	
	
	public static void main(String[] args) {
		System.out.println(staticVar);
		staticVar = 10;
		System.out.println(staticVar);
		System.out.println(ParentClass.staticVar);
	}

}
