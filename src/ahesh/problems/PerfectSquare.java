package ahesh.problems;

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
		if()
			
		int min = num;
		
		for(int i = 1; i * i <= num; i++) {
			if(num - i * i >= 0) {
				min = Integer.min(min, 1 + getMinPartition(num - i * i, dp));
			}
			
		}
	}
	public static void fillDp(int[] dp) {
		for(int i = 0; i < dp.length; i++) {
			dp[i] = dp[i + 1];
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
		int num = 12;
		int[] dp = new int[num + 1];
		dp[0] = 1;
		dp[1] = 1;
		
		System.out.println("Result: " + getMinPartition(num, dp));
		System.out.println("Result: " + getMinPerfectSquare(num));
		
	}
}
