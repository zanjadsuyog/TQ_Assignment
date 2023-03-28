package Day2;

public class final_finnaly_finalize {

	public static void main(String[] args) {
//		WAP to show the difference between final, finally, finalize.ted method stub

	}

}
/*
final: The final keyword is used to declare a variable, method, or class as unchangeable or immutable.
 When applied to a variable, it means that the variable's value cannot be modified once it has been assigned. 
 When applied to a method, it means that the method cannot be overridden by a subclass.
  When applied to a class, it means that the class cannot be subclassed.
Example:

java
Copy code
final int x = 10;
final class MyClass { ... }
final void myMethod() { ... }


finally: The finally block is used in a try-catch statement to specify code that 
should be executed regardless of whether an exception is thrown or not. 
The code in the finally block is guaranteed to execute even if an exception occurs or 
if the try or catch blocks return or throw an exception.
Example:

try {
    // Code that may throw an exception
} catch (Exception e) {
    // Exception handling code
} finally {
    // Code that should always execute, even if an exception is thrown or caught
}


finalize: The finalize() method is called by the garbage collector when it determines that an object is no longer being used and can be removed from memory. It is called just before the object is garbage collected. The finalize() method can be overridden in a class to perform any necessary cleanup actions before the object is removed from memory.
Example:

java
Copy code
class MyClass {
    // Class implementation

    @Override
    protected void finalize() throws Throwable {
        // Cleanup actions
        super.finalize();
    }
}
So to summarize, final is used to declare something as unchangeable or immutable,
 finally is used in a try-catch statement to specify code that should always execute,
  and finalize is a method that is called by the garbage collector to perform cleanup actions before an object 
  is removed from memory.

*/



