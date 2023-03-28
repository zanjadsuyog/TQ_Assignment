package Assignment;

public class SecondMax {

	public static void main(String[] args) {
		// WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
		int[] arr = { 20, 0, 31, 45, 100, 1, 105, 90 };

		int maxVal = Integer.MIN_VALUE;
		int secondMaxVal = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				secondMaxVal = maxVal;
				maxVal = arr[i];
			} 
			
			else if (arr[i] > secondMaxVal && arr[i] < maxVal)
			{
				secondMaxVal = arr[i];
			}
		}

		System.out.println("The second maximum value is: " + secondMaxVal);
	}

}
