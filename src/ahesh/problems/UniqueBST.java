//Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
//
//Example 1:
//
//Input: n = 3
//Output: 5

package ahesh.problems;

public class UniqueBST {
	
	public static int getNumTrees(int sum, int i, int[] subFactor) {
		
		
		if(iMod2 == 1) {
			int result = 2 * sum - subFactor[iMod2];
			return result;
		}
		return 2 * sum;
	}
	
	public static int numTrees(int n) {
		if(n <= 1) return n;
		
		int sum = 1;
		int[] subFactor = new int[n / 2 + 1];
		
		for(int i = 2; i <= n; i++) {
			sum += getNumTrees(sum, i , subFactor);
			updateSubFactor(sum, subFactor);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int num = 3;
		
		System.out.println("Result: " + numTrees(num));
	}
	   
}
