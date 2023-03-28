package com.innerclass;

interface Double {
	public void doIt();
}

class car {
	public void driver() {
		System.out.println("I am driving");
	}

}

abstract class cake {
      void doBarking()
      {
    	  System.out.println("i an barking");
      }
}



public class Ananomousclass {

	public static void main(String[] args) {

		Double double1=new Double() {
			
			@Override
			public void doIt() {

				System.out.println("I am doing..");
			}
		};
		
		double1.doIt();
		//using concreate class 
		
		car c1=new car();
		c1.driver();
		
	}

}
