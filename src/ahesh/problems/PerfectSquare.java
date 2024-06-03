package ahesh.problems;

import java.util.Arrays;

public class PerfectSquare {
	
	public static int getPerfectSquareLessOrEqual(int num) {
		
		int start = 1;
		int end  = num;
		int res = -1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int midSquare = mid * mid;
			
			if(midSquare == num) {
				return midSquare;
			} else if(midSquare < num) {
				start = mid + 1;
				res = midSquare;
			} else {
				end = mid - 1;
			}
		}
		
		return res;
	}
	
	public static int getMinPartition(int num, int[] dp) {
		if(dp[num] != num + 1) return dp[num];
			
		int min = num;
		
		for(int i = 1; i * i <= num; i++) {
			if(num - i * i >= 0) {
				min = Integer.min(min, 1 + getMinPartition(num - i * i, dp));
			}
		}
		dp[num] = min;
		
		return min;
	}
	
	public static int getMinPattitionDp(int num, int[] dp) {
		
		for(int i = 2; i <= num; i++) {
			int min = i;
			for(int j = 1; j * j <= num; j++) {
				
				if((i - j * j) >= 0) {
					min = Integer.min(min, 1 + dp[i - j * j]);
					System.out.println("j * j :" + j * j);
					System.out.println("Dp: " + Arrays.toString(dp));
//					System.out.println("num: " +);
				}
			}
			
			dp[i] = min;
			System.out.println("Dp: " + Arrays.toString(dp));
		}
		
		return dp[num];
	}
	
	public static void fillDp(int[] dp) {
		for(int i = 0; i < dp.length; i++) {
			dp[i] = i + 1;
		}
	}
	
	public static int getMinPerfectSquare(int num) {
		int res = 0;
		
		while(num != 0) {
			res++;
			num -= getPerfectSquareLessOrEqual(num);
			System.out.println("Num: " + num);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int num =1000;
		int[] dp = new int[num + 1];
//		fillDp(dp);
		
//		System.out.println("Dp:" + Arrays.toString(dp));
		dp[0] = 0;
		dp[1] = 1;
		
		System.out.println("Result: " + getMinPattitionDp(num, dp));
//		System.out.println("Result: " + getMinPerfectSquare(num));
		
	}
}
