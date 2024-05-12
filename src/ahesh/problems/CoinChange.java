package ahesh.problems;

public class CoinChange {
	
	public static int minCoins(int[] coins, int target) {
		if(target == 0) return 0;
		
		int noOfWays = Integer.MAX_VALUE;
		
		for(int i = 0; i < coins.length; i++) {
			int temp = target - coins[i];
			
			if(temp >=0) {
				noOfWays = Integer.min(noOfWays, minCoins(coins, temp) + 1);
			} else {
				return -1;
			}
		}
		
		return noOfWays == Integer.MAX_VALUE ? - 1 : noOfWays;
	}
	
	public static void main(String[] rags) {
		int[] coins = {2};
		int target = 11;
		
		System.out.println("Result: " + minCoins(coins, target));
	}
}
