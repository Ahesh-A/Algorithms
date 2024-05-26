//Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
//
//Example 1:
//
//Input: n = 3
//Output: 5

package ahesh.problems;

public class UniqueBST {
	
	public static void updateSubFactor(int sum, int idx, int num,  int[] subFactor) {
		if(idx <= num / 2) {
			subFactor[idx] = sum;
		}
	}
	
	public static int getNumTrees(int sum, int i, int[] subFactor) {
		
		if(i % 2 == 1) {
			return 2 * sum - subFactor[i / 2];
		}
		return 2 * sum;
	}
	
	public static void fillDp(int idx, int[] dp) {
		for(int i = 1; i <= idx; i++) {
			dp[idx] += dp[Integer.max(i - 1, idx - i)];
		}
	}
	
	public static int numTrees(int n) {
		if(n <= 1) return n;
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		
		for(int i = 1; i <= n; i++) {
			fillDp(i, dp);
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("Result: " + numTrees(num));
	}
	   
}
