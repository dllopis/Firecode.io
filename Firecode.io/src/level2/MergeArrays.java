package level2;

import java.util.Arrays;

public class MergeArrays {

	public static int[] merge(int[] arrLeft, int[] arrRight){
	    
	    int size = arrLeft.length + arrRight.length;
	    
	    // initialize our mergedArray to the sum of original arrays
	    int[] mergedArray = new int[size];
	    
	    // three index pointers for arrLeft, arrRight, mergedArray
	    int i , j, k;
	    i = j = k = 0;
	    
	    // begin populating merged array in ascending order
	    while(i < arrLeft.length && j < arrRight.length) {
	        mergedArray[k++] = arrLeft[i] <= arrRight[j] ? arrLeft[i++] : arrRight[j++];
	    }
	    
	   // make sure each array is emptied onto merged array if one array was exhausted or empty
	    while(i < arrLeft.length)
	    	mergedArray[k++] = arrLeft[i++];
	    
	    while(j < arrRight.length)
	    	mergedArray[k++] = arrRight[j++];
		return mergedArray;
	}
	
	public static void main(String[] args) {
		int[] a = {2,5,7,8,9};
		int[] b = {4,9};
		int[] c = merge(a,b);
		
		System.out.println(Arrays.toString(c));
	}
}
