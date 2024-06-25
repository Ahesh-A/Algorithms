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
		
		int[] res = new int[arrLen];
		
		for(int i = 0; i < arrLen; i++) {
			int idx = (i + rotationFactor) % arrLen;
			res[idx] = arr[i];
		}
		
		for(int i = 0; i < arrLen; i++){
			arr[i] = res[i];
		}
		
	}
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start ++;
			end --;
		}
	}
	
	public static void rotateArray1(int[] arr, int k) {
		int arrLen = arr.length;
		k = k % arrLen;
		
		reverse(arr, 0, arrLen - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arrLen - 1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray1(arr, k);
		System.out.println("Result: " + Arrays.toString(arr));
	}
}
