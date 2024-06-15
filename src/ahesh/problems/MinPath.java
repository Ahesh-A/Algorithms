//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
//
//Note: You can only move either down or right at any point in time.
//
// 
//
//Example 1:
//
//
//Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//Output: 7
//Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
//Example 2:
//
//Input: grid = [[1,2,3],[4,5,6]]
//Output: 12

package ahesh.problems;

public class MinPath {
	
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		
//		int[][] dp = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				grid[i][j] += getMinOfTwoPaths(i, j, grid);
			}
		}
		
		return grid[row - 1][col - 1];
	}	
	
	public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
	}
	
}
