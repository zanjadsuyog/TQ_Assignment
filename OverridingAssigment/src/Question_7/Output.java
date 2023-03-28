package Question_7;

 class Derived 
{ 
    public int getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp);
		return 0; 
    } 
} 
  
public class Output extends Derived 
{ 
    @Override
	public int getDetails(String temp) 
    { 
        System.out.println("Test class " + temp); 
        return 0; 
    } 
    public static void main(String[] args) 
    { 
        Output obj = new Output(); 
        obj.getDetails("Hello"); 
    } 
} 
