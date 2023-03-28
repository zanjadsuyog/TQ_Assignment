package com.assignmentprogram;

import java.util.ArrayList;

public class For_EachLoop {

//	WAP to iterate through all elements in an ArrayList using for loop
	
	public static void main(String[] args) {
		
	
	ArrayList<String> l1=new ArrayList<>();
	
	l1.add("Omkar");
	l1.add("harsh");
	l1.add("vivek");
	l1.add("suyog");
	l1.add("tajes");
	
	for(String name: l1)
	{
		System.out.println(name);
	}
}}
