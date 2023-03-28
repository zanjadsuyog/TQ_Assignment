package com.Overloadding;

public class Number {
	  
	static int number(int x,int y)
	{
		for (int i=x;i<y;i++)
		{
			System.out.print(i+" ");
		}
		return y;
	}
	
	static char number(char x,char y)
	{
		for (int i=x;i<y;i++)
		{
			System.out.print(i+" ");
		}
		return y;
	}
	static byte number(byte x,byte y)
	{
		for (int i=x;i<y;i++)
		{
			System.out.print(i+" ");
		}
		return y;
	}

	public static void main(String[] args) {

		System.out.println(number(1, 5));
		System.out.println(number('a', 'e'));
		System.out.println(number(2, 7));
	}

}
