//Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
//
//Example 1:
//
//Input: n = 3
//Output: 5

package ahesh.problems;

import java.util.Arrays;

public class UniqueBST {
	public static void fillDp(int idx, int[] dp) {
		int sum = 0;
		for(int i = 1; i <= idx; i++) {
			sum += dp[i - 1] * dp[idx - i];
		}
		
		dp[idx] = sum;
	}
	
	public static int numTrees(int n) {
		
		int[] dp = new int[n + 1];
		dp[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			fillDp(i, dp);
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println("Result: " + numTrees(num)); //16796
	}
	   
}
