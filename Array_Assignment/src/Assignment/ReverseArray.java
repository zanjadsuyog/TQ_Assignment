package Assignment;

public class ReverseArray {

//	WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] 
//  so your output must be 78, 37, 29, 45, 90, 3

	public static void main(String[] args) {
		int[] arr = { 3, 90, 45, 29, 37, 78 };

		// Iterate over the array in reverse order and print the elements
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
