package ahesh.problems;

import java.util.HashMap;

public class DecodeWays {
	
	public static void updateDpForSingleDigit(int number, int[] dp, int idx) {
		
		if(number != 0) {
			dp[idx] += dp[idx - 1];
		}
	}
	
	public static void updateDpForDoubleDigit(int number, int[] dp, int idx) {
		if(number > 9 && number <= 26) {
			dp[idx] += dp[idx - 2];
		}
	}
	
	public static void getDp(String s, int[] dp) {
		int n = s.length();
		
		for(int i = 2; i <= n; i++) {
			int singleDigit = s.charAt(i - 1) - '0';
			int doubleDigit = Integer.parseInt(s.substring(i - 2, i));
			
			
			
			
		}
	}
	
	public static int noOfWaysToDecode(String s) {
		if(s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
		
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = 1;
		
		getDp(s, dp);
		return dp[s.length()];
	}
	
	public static void main(String[] args) {
		String s = "111111111111111111111111111111111111111111111"; //1836311903
		System.out.println("Result: " + noOfWaysToDecode(s));
		
	}
}
