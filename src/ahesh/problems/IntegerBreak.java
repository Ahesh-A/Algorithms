//Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
//
//Return the maximum product you can get.
//
// 
//
//Example 1:
//
//Input: n = 2
//Output: 1
//Explanation: 2 = 1 + 1, 1 × 1 = 1.
//Example 2:
//
//Input: n = 10
//Output: 36
//Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
// 
//
//Constraints:
//
//2 <= n <= 58
package ahesh.problems;

import java.util.Arrays;

public class IntegerBreak {
	public static int integerBreakDP(int n, int[] dp) {
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		for(int i = 1; i <= n / 2; i++) {			
			dp[n] = Integer.max(i * integerBreakDP(n - i, dp), dp[n]);
		}
		
		return dp[n];
	}
	
	public static int integerBreak(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		if(n == 3) {
			return 2;
		}
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		
		return integerBreakDP(n, dp);
	}
	
	public static void main(String[] args) {
		int res = integerBreak(58);
		System.out.println("Result: " + res);
	}
}
