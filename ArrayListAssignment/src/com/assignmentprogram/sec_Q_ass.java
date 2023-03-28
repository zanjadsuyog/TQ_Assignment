package com.assignmentprogram;

import java.util.ArrayList;

public class sec_Q_ass {

	//WAP add elements to arraylist without using generics, 
	//0th location keep Integer, 1st location String now print each element and
	//display contents.
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList<>();
		l.add(0,new Integer(10));
		l.set(1, 5);

		System.out.println(l);
	}
}

