package com.assignmentprogram;

import java.util.ArrayList;

public class NotUsingGeneric {

//	WAP to add elements to arraylist without using generics (no <>) and 
//	print content of it where Integer is used.
//	In second arraylist String is used.
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList<>();
		a1.add(1);
		a1.add("java");
		a1.add("suyog");
		a1.add(90);
		
		System.out.println(a1);
		
		ArrayList<String>  aStrings=new ArrayList<>();
		aStrings.add("patil");
		aStrings.add("Vivek");
		aStrings.add("Adinath");
		aStrings.add("yashank");
		
		
		System.out.println(aStrings);
	}
}
