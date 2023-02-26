package com.classsolve14feb;

public class VaragsDemo {
	
	public static void display(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	
		System.out.println();
	}
	
	public static void displayVar(int ...ar)
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	
	}
	
	

	public static void main(String[] args) {

       int arr[]= {8,3,4,5};
       int arr1[]= {7,2};
       int arr2[]= {9,2,5,7,8,9};
       
       display(arr2);
       display(arr1);
       display(arr);
       
       displayVar(7,5,6,3,2);
       displayVar(4,0,3);
       displayVar(3);
       displayVar();
       
       
       
       

	}

}
