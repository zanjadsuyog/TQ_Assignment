package com.Overloadding;

public class Max {

	static int max(int x, int y) {
		return x > y ? x : y;
	}

	static int max(byte x, byte y) {
		return x > y ? x : y;
	}

	static float max(float x, float y) {

		if (x > y) {
			return x;

		} else {
			return y;
		}
	}

	static double max(double d, float y) {
		return d > y ? d : y;

	}

	static int max(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z) {
			return y;
		} else {
			return z;
		}

	}

	public static void main(String[] args) {

		System.out.println(max(23.4, 34.6f));
		System.out.println(max(132, 34));
		byte a = 10, b = 5;
		System.out.println(max(a, b));
		
		System.out.println(max(5, 8, 6));
	}

}
