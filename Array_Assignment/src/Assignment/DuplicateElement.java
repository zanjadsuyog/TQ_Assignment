package Assignment;

public class DuplicateElement {

	public static void main(String[] args) {
//		Write a Java program to find the duplicate values of an array
//		of integer values. Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61],
//      so duplicates are 10 and 78.

		int arr[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61 };
		int temp[] = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {

				temp[j] = arr[i];
				j++;
			}

		}
		temp[j]=arr[arr.length-1];
		for(int i=0;i<temp.length-1;i++)
		{
			System.out.println(temp[i]+"  ");
		}
	}

}
