//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]

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
		int[] arr = {-1, -100, 3, 99};
		int k = 3;
		rotateArray(arr, k);
		
	}
}
