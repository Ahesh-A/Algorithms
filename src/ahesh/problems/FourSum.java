//377. Combination Sum IV
//Medium
//Topics
//Companies
//Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
//
//The test cases are generated so that the answer can fit in a 32-bit integer.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3], target = 4
//Output: 7
//Explanation:
//The possible combination ways are:
//(1, 1, 1, 1)
//(1, 1, 2)
//(1, 2, 1)
//(1, 3)
//(2, 1, 1)
//(2, 2)
//(3, 1)
//Note that different sequences are counted as different combinations.
//Example 2:
//
//Input: nums = [9], target = 3
//Output: 0

package ahesh.problems;

public class FourSum {
	
	
	public static int getFourSum(int[] arr, int[] dp, int target) {
		
		for(int i = 1; i <= target; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i - arr[j] >= 0) {
					dp[i] += dp[i - arr[j]];
				}
			}
		}
		
		return dp[target];
	}
	
	public static void main(String[] args) {
		int[] nums = {9};
		int target = 3;
		int[] dp = new int[target + 1];
		dp[0] = 1;
		System.out.println("Result: " + getFourSum(nums, dp, target));
	}
}
