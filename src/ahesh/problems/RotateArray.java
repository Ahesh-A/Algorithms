package ahesh.problems;

import java.util.Arrays;

public class RotateArray {
	
	public static void rotateArray(int[] arr, int rotationFactor) {
		int arrLen = arr.length;
		
		int r = 0, k, rval = arr[r], kval;
		
		for(int i = 0; i < arr.length; i++) {
			k = (r + rotationFactor) % arrLen;
			kval = arr[k];
			arr[k] = rval;
			rval = kval;
			r = k;
			
			System.out.println("Result: " + Arrays.toString(arr));
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		rotateArray(arr, k);
		
	}
}
