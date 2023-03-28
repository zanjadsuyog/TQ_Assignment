package Static;

public class StaticOverload {

	/*
	 * See if you can overload static method, by using static keyword for 2nd
	 * overloaded method and without using static keyword.
	 */
	
	public static void print(int a)
	{
		System.out.println(a);
	}
	
	public  void print(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	
	public static void main(String[] args) {

		print(2);
		
		StaticOverload s1=new StaticOverload();
		
		s1.print(3, 4);
	}

}
