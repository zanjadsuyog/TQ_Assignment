package Assignment;

import java.util.Arrays;

public class ReverseByUsingTemproryArray {

	
	public static void main(String[] args) {
		int arr[]= {23,45,67,87,90,34};
		
		int temp[]=new int [arr.length];
		
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

        	temp[j]=arr[i];
        	
        }
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]=temp[i];
        }
        
        System.out.println(Arrays.toString(arr));
		
	}
}
