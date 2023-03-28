package Assignment;

public class Second_Min_value {

	//	WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]

	
	public static void display(int arr[])
	{
		int minVal = Integer.MAX_VALUE;
		int secMinVal = Integer.MAX_VALUE;

		{
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < minVal) {
					secMinVal = minVal;
					minVal = arr[i];
				}
				else if (arr[i] < secMinVal && arr[i] > minVal) {
					secMinVal = arr[i];
				}
			}

			System.out.println("The second minimum value is: " + secMinVal);
		}
	}
	public static void main(String[] args) {

		int[] arr = { -20, 0, -25, 15, 19, 37, 23 };
		display(arr);
	}
		
}
