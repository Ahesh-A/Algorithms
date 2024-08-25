//31. Next Permutation
//Medium
//Topics
//Companies
//A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//
//For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
//
//For example, the next permutation of arr = [1,2,3] is [1,3,2].
//Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
//Given an array of integers nums, find the next permutation of nums.
//
//The replacement must be in place and use only constant extra memory.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [1,3,2]
//Example 2:
//
//Input: nums = [3,2,1]
//Output: [1,2,3]
//Example 3:
//
//Input: nums = [1,1,5]
//Output: [1,5,1]

package ahesh.problems;

import java.util.Arrays;

public class NextPermutation {
	
//	public static void sort(int start, int end, int[] arr) {
//		
//		int[] temp = new int[end - start + 1];
//		
//		for (int i = start; i <= end; i++) {
//			temp[i - start] = arr[i];
//		}
//		
//		Arrays.sort(temp);
//		
//		for (int i = start; i <= end; i++) {
//			arr[i] = temp[i - start];
//		}
//	}
	
	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int getIndexForNumberLessThanUpcommingNumber(int[] arr) {
		int len = arr.length;
		int max = arr[len - 1];
		
		for(int i = len - 2; i >= 0; i--) {
			if(arr[i] < max) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int getNearestBiggestNumber(int[] arr, int idx) {
		int res = -1;
		int max = Integer.MAX_VALUE;
		int num = arr[idx];
		
		for(int i = idx + 1; i < arr.length; i++) {
			if(num < arr[i] && arr[i] < max) {
				max = arr[i];
				res = i;
			}
		}
		
		return res;
	}
	
	public static void getNextPermutation(int[] arr) {
		int start = getIndexForNumberLessThanUpcommingNumber(arr);
		
		if(start == -1) {
			sort(0, arr.length - 1, arr);
			return;
		}
		
		int end = getNearestBiggestNumber(arr, start);
		swap(start, end, arr);
		sort(start + 1, end, arr);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 1, 2};
		getNextPermutation(arr);
//		System.out.println(getNearestBiggestNumber(arr, getIndexForNumberLessThanUpcommingNumber(arr)));
		System.out.print(Arrays.toString(arr));
	}
}
