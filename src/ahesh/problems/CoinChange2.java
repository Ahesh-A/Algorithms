//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//
//Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
//
//You may assume that you have an infinite number of each kind of coin.
//
//The answer is guaranteed to fit into a signed 32-bit integer.
//
// 
//
//Example 1:
//
//Input: amount = 5, coins = [1,2,5]
//Output: 4
//Explanation: there are four ways to make up the amount:
//5=5
//5=2+2+1
//5=2+1+1+1
//5=1+1+1+1+1
package ahesh.problems;

import java.util.Arrays;

public class CoinChange2 {
	public static int getNumOfWays(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;
		
		for (int i = 0; i < coins.length; i++) {
			for(int j = 1; j <= amount; j++) {
				if(j - coins[i] >= 0) {
					dp[j] += dp[j - coins[i]];
				}
			}
		}
		return dp[amount];
	}
	
	public static void main(String[] args) {
		int amount  = 6;
		int[] coins = {1, 2, 5};
		
		System.out.println("No.of.ways: " + getNumOfWays(amount, coins));
	}
}
