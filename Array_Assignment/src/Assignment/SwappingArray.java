package Assignment;

import java.util.Arrays;

public class SwappingArray {
	
//	WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4]
		
	 public static void main(String[] args) {
	        int[] arr = {2, 4, 9, 0};
	        
	        int temp1 = arr[arr.length - 1];
	        int temp2 = arr[arr.length - 2];
	        
	        for (int i = arr.length - 3; i >= 0; i--) {
	            arr[i+2] = arr[i];
	        }
	        
	        arr[0] = temp1;
	        arr[1] = temp2;
	        
	        System.out.println(Arrays.toString(arr));
	    }
}
