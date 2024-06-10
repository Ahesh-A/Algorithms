//1911. Maximum Alternating Subsequence Sum
//Medium
//Topics
//Companies
//Hint
//The alternating sum of a 0-indexed array is defined as the sum of the elements at even indices minus the sum of the elements at odd indices.
//
//For example, the alternating sum of [4,2,5,3] is (4 + 5) - (2 + 3) = 4.
//Given an array nums, return the maximum alternating sum of any subsequence of nums (after reindexing the elements of the subsequence).
//
//A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order. For example, [2,7,4] is a subsequence of [4,2,3,7,2,1,4] (the underlined elements), while [2,4,2] is not.
//
// 
//
//Example 1:
//
//Input: nums = [4,2,5,3]
//Output: 7
//Explanation: It is optimal to choose the subsequence [4,2,5] with alternating sum (4 + 5) - 2 = 7.
//Example 2:
//
//Input: nums = [5,6,7,8]
//Output: 8
//Explanation: It is optimal to choose the subsequence [8] with alternating sum 8.
//Example 3:
//
//Input: nums = [6,2,1,2,4,5]
//Output: 10
//Explanation: It is optimal to choose the subsequence [6,1,5] with alternating sum (6 + 5) - 1 = 10.


package ahesh.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAlternatingSubsequenceSum {
	
	public static int getRes(int[] nums, boolean skip, boolean add, int idx) {
		
		if(skip) return 0;
		
		if(add) return  nums[idx];
		
		return -1 *  nums[idx];
	}
	
	public static Map<Integer, Boolean> getKey(int idx, boolean add) {
		Map<Integer, Boolean> key = new HashMap<Integer, Boolean>();
		key.put(idx, add);
		
		return key;
	}
	
	public static int getMaxAlternatingSum(int[] nums, boolean add, int res, int idx, Map<Map<Integer, Boolean>, Integer> map) {
		if(idx > nums.length - 1) return 0;
		Map<Integer, Boolean> key = getKey(idx, add);
		if(map.containsKey(key)) return map.get(key);
		
		int added = 0;
		int skipped = 0;
		

		
//		int res = 0;
		
		added += getMaxAlternatingSum(nums, !add, getRes(nums, false, add,  idx), idx + 1, map);
		skipped += getMaxAlternatingSum(nums ,add, getRes(nums, true, add,  idx), idx + 1, map);
		
		
		res = Integer.max(added, skipped);
		map.put(key, res);
		System.out.println("(" + idx + ", " + add + ") --> " + res);
		return res;
	}
	
	public static void main (String[] args) {
//		int[] arr = {6,2,1,2,4,5};
		int[] arr = {5};
		Map<Map<Integer, Boolean>, Integer> map = new HashMap<>();
		
//		Map<Integer, Boolean> key = new HashMap<Integer, Boolean>();
//		key.put(1, true);
//		
//		map.put(key, 2);
//		
//		Map<Integer, Boolean> key1 = new HashMap<Integer, Boolean>();
//		key1.put(1, true);
//		
//		System.out.println(map.get(key1)); 
		
		System.out.println("Result: " + getMaxAlternatingSum(arr, true, 0, 0, map));
	}
	
	
}
