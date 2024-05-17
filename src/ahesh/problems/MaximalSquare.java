//Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 4

package ahesh.problems;

public class MaximalSquare {
	public static int getMaximalSquare(String [][] arr) {
		int max = 0;
		final int row = arr.length;
		final int col = arr[0].length;
		
		for(int row = )
		return max
	}
	
	public static void main(String[] args) {
		String[][] arr = {
				{"1","0","1","0","0"},
				{"1","0","1","1","1"},
				{"1","1","1","1","1"},
				{"1","0","0","1","0"}
		};
		
		System.out.println("Result: " + getMaximalSquare(arr));
	}
}
