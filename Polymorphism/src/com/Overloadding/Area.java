package com.Overloadding;

public class Area{

	static int area(Float pi,int r)
	{
		int area=(int) (pi*r*r);
		return area;
	}
	static int area(int l,int b)
	{
		int radius=l*b;
		return radius;
	}
	static int area(int s)
	{
		int square=s*s;
		return square;
	}
	static double area(double h,double b)
	{
		double aa=1/2*(h*b);
		return aa;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(area(3.14f, 2));
		System.out.println(area(4,5));
		System.out.println(area(5));
		System.out.println(area(5, 7));

	}
}
