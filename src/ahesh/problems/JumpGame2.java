//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//0 <= j <= nums[i] and
//i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
//
// 
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

package ahesh.problems;

import java.util.Arrays;

public class JumpGame2 {
	
	public static void setDpHelper(int[] dp, int modifiedTarget, int tempTarget) {
		if(modifiedTarget >= 0) {
			dp[tempTarget] = Integer.min(dp[tempTarget], 1 + dp[modifiedTarget]);
		}
	}
	
	public static void setDp(int[] nums, int[] dp, int tempTarget) {
		for(int j = 0; j < nums.length; j++) {
			int modifiedTarget= tempTarget - nums[j];
			
			setDpHelper(dp, modifiedTarget, tempTarget);
		}			
	}
	
	public static int getMinCoinCount(int[] nums, int target, int[] dp) {
		for(int i = 1; i <= target; i++) {
			setDp(nums, dp, i);
		}
		
		return dp[target] != target + 1 ? dp[target] : -1;
	}
	
	public static void initailzeArray(int[] arr, int number) {
		for(int i = 1; i < arr.length; i++) {
			arr[i] = number;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 4};
		int target = 7;
		int[] dp = new int[target + 1];
		initailzeArray(dp, target + 1);
		dp[0] = 0;
		System.out.println("Result: " + getMinCoinCount(nums, target, dp));
	}
}
