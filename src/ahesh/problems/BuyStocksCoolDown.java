//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
//
//After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
//
// 
//
//Example 1:
//
//Input: prices = [1,2,3,0,2]
//Output: 3
//Explanation: transactions = [buy, sell, cooldown, buy, sell]
//Example 2:
//
//Input: prices = [1]
//Output: 0
package ahesh.problems;

import java.util.Arrays;

public class BuyStocksCoolDown {
	public enum Options {
		BUY, SELL, COOLDOWN
	}
//	public static int maxProfitHelper(int[] arr, int idx, Options option, int dp[]) {
//		
////		int[] dp = new int [arr.length];
//		
//		if(idx >= arr.length) {
//			return 0;
//		}
//		
//		if(option == Options.BUY) {
//			dp[idx] = maxProfitHelper(arr, idx + 1, Options.SELL, dp) - arr[idx];
//		}
//		
//		if(option == Options.SELL) {
//			dp[idx] =  maxProfitHelper(arr, idx + 2, Options.BUY, dp) + arr[idx];
//		}
//		
//		int skip = maxProfitHelper(arr, idx + 1, option, dp);
//		dp[idx] = Integer.max(dp[idx], skip);
//		
//		return dp[idx];
//	}
	
	public static int maxProfit(int[] arr) {
		return maxProfitHelper(arr, 0, Options.BUY, new int[arr.length]);
	}
	
	public static int maxProfitDP(int[] arr) {
		
		int arrLen = arr.length;
//		if(arrLen == 1) {
//			return 0;
//		}
		
		int[] s1 = new int[arrLen];
		int[] s2 = new int[arrLen];
		int[] s3 = new int[arrLen];
		
		s1[0] = 0;
		s2[0] = - arr[0];
		s3[0] = 0;
		
		for(int i = 1; i < arrLen; i++) {
			s1[i] = Integer.max(s1[i - 1], s3[i - 1]);
			s2[i] = Integer.max(s2[i - 1], s1[i - 1] - arr[i]);
			s3[i] = s2[i - 1] + arr[i];
			
			System.out.println(Arrays.toString(s1));
			System.out.println(Arrays.toString(s2));
			System.out.println(Arrays.toString(s3));
			System.out.println();
		}
		
		return Integer.max(s1[arrLen -1], s3[arrLen - 1]);
	}
	public static void main(String[] args) {
		int[] arr = {1, 342, 24, 23, 3, 2};
		
		int res = maxProfit(arr);
		System.out.println("Result: " + res);
	}
}
