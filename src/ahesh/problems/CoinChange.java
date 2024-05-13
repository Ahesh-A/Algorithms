package ahesh.problems;

public class CoinChange {
	
	public static void fillArrWithValues(int[] dp, int value) {
		for(int i = 0; i < dp.length; i++) {
			dp[i] = value;
		}
	}
	
	public static int minCoinsFinder(int[] coins, int target, int[] dp) {
		if(dp[target] != target + 1) return dp[target];
			
		for(int i = 1; i <= target; i++) {
			for(int j = 0; j < coins.length; j++) {
				int temp = i - coins[j];
				
				if(temp >= 0) {
					dp[i] = Integer.min(dp[i], 1 + dp[temp]);
				}
			}
		}
		
		return dp[target] != target + 1 ? dp[target] : -1;
	}
	
	public static int minCoins(int[] coins, int target) {
		int[] dp = new int[target + 1];
		
		fillArrWithValues(dp, target + 1);
		
		dp[0] = 0;
		
		return minCoinsFinder(coins, target, dp);
	}
	
	
	public static void main(String[] rags) {
		int[] coins = {1, 3, 4, 5};
		int target = 7;
		int i = Integer.MAX_VALUE;
		
		System.out.println("Result: " + minCoins(coins, target));
	}
}
