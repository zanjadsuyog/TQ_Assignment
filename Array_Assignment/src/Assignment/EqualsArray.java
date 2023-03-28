package Assignment;

public class EqualsArray {

	public class ArrayEqualityTest {
	    public static void main(String[] args) {
	        int[] arr1 = {12, 22, 32, 42, 52, 62};
	        int[] arr2 = {52, 22, 62, 12, 42, 22};

	        boolean areEqual = true;
	        
	        if (arr1.length != arr2.length) {
	            areEqual = false;
	        } else {
	            for (int i = 0; i < arr1.length; i++) {
	                boolean foundMatch = false;
	                for (int j = 0; j < arr2.length; j++) {
	                    if (arr1[i] == arr2[j]) {
	                        foundMatch = true;
	                        break;
	                    }
	                }
	                if (!foundMatch) {
	                    areEqual = false;
	                    break;
	                }
	            }
	        }

	        if (areEqual) {
	            System.out.println("The arrays are equal.");
	        } else {
	            System.out.println("The arrays are not equal.");
	        }
	    }
	}

}
