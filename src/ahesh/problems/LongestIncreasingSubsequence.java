//Given an integer array nums, return the length of the longest strictly increasing subsequence.
//
// 
//
//Example 1:
//
//Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
//Example 2:
//
//Input: nums = [0,1,0,3,2,3]
//Output: 4
//Example 3:
//
//Input: nums = [7,7,7,7,7,7,7]
//Output: 1

package ahesh.problems;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {
	
	public static int lengthOfLIS1(int[] nums) {
		 if(nums == null || nums.length == 0){
	            return 0;
	        }
	        int [] ends = new int[nums.length];
	        ends[0] = nums[0];
	        int right = 0;
	        for(int i =1;i<nums.length;i++){
	            int low = 0;
	            int high = right;
	            while(low <= high){
	                int mid = low + ((high - low) >> 2);
	                if(nums[i] > ends[mid]){
	                    low = mid + 1;
	                }else{
	                    high = mid - 1;
	                }
	            }
	            right = Math.max(right,low);
	            ends[low] = nums[i];
	            System.out.println(Arrays.toString(ends));
	        }
	        
	        return right + 1;
	    }
	

	public static int lengthOfLIS(int[] nums) {
		int length = nums.length;
		Integer[] dp = new Integer[length];
		dp[length - 1] = 1;
		
		for(int i = length - 1; i >= 0; i--) {
			dp[i] = 1;
			for(int j = i; j < length; j++) {
				if(nums[i] < nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		return Collections.max(Arrays.asList(dp));
	}
	
	public static void main(String[] args) {
		int[] nums = {10 , 9, 2, 5, 3, 101, 7 , 18, 1, 5, 1, 1, 1, 1 };
		System.out.println("Result: " + lengthOfLIS1(nums));
	}
}
