package com.assignmentprogram;

import java.util.ArrayList;

public class Printcolor {

//	WAP to create a new ArrayList, add some colors (string) and print the collection.

	public static void main(String[] args) {
		// create a new ArrayList of colors
		ArrayList<String> colors = new ArrayList<String>();

		// add some colors to the list
		colors.add("red");
		colors.add("green");
		colors.add("blue");

		// print the contents of the list
		System.out.println("Colors: " + colors);
	}

}
