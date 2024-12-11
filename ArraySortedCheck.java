package BAT_IT_2022_P_18;

public class ArraySortedCheck {
	 public static boolean isSorted(int[] arr) {
	        // Loop through the array and compare adjacent elements
	        for (int i = 0; i < arr.length - 1; i++) {
	            // If the current element is greater than the next, array is not sorted
	            if (arr[i] > arr[i + 1]) {
	                return false;
	            }
	        }
	        // If loop completes, the array is sorted
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1, 2, 3, 4};
        System.out.println(isSorted(inputArray)); // Output: true
    }
}


