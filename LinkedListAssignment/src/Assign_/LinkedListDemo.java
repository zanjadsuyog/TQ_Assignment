package Assign_;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

     LinkedList<String> llist= new LinkedList<>();
     
     
     llist.add("Java");
     llist.add("Python");
     llist.add("Html");
     
     System.out.println(llist);
		
     // add and offer
     
     llist.addFirst("C++");// returns void
     
     System.out.println(llist);
     
     System.out.println(llist.offerFirst("Angular"));
     
     System.out.println(llist);
     
     llist.add("SpringBoot"); // adds at last
     System.out.println(llist);
     
     // remove and poll
     
    System.out.println(llist.remove());// remove and retreive first element: NoSuchElementException
    System.out.println(llist); 
    
    System.out.println(llist.poll()); // removes and retrieve : null if empty
    
    
    LinkedList<String> lang= new LinkedList<>();
    //System.out.println(lang.remove()); // exception is empty
    
    System.out.println(lang.poll());// return null
    
    /////get and peek
    System.out.println(lang.peekFirst()); // returns null
    
    //System.out.println(lang.getFirst()); // return exception
    
    System.out.println(llist.element());// first element of the list
  //  System.out.println(lang.element()); // exception
    
    /// stack : push ... pop
    
    
  llist.push("Devops"); // addFirst()
  System.out.println(llist);
  
  System.out.println(llist.pop());// removeFirst()
 
  
    
    
		
	}

}
