//There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//
//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//
//The test cases are generated so that the answer will be less than or equal to 2 * 109.
//
// 
//
//Example 1:
//
//
//Input: m = 3, n = 7
//Output: 28
//Example 2:
//
//Input: m = 3, n = 2
//Output: 3
//Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down

package ahesh.problems;

import java.util.Arrays;

public class UniquePaths {
	
	public static void fillRowWithVal(int rowIdx, int val, int[][] arr) {
		for(int i = 0; i < arr[0].length; i++) {
			arr[rowIdx][i] = val;
		}
	}
	
	public static void fillColWithVal(int colIdx, int val, int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i][colIdx] = val;
		}
	}
	
	public static int getUniquePaths(int rows, int cols) {
		int[][] paths = new int[rows][cols];
		fillRowWithVal(0, 1, paths);
		fillColWithVal(0, 1, paths);
		
//		System.out.println(Arrays.deepToString(paths));
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j < cols; j++) {
				paths[i][j] = paths[i - 1][j] + paths[i][j -1];
			}
		}
		return paths[rows - 1][cols - 1];
	}
	
	public static void main(String[] args) {
		int rows = 3;
		int cols = 7;
		
		System.out.println("Result: " + getUniquePaths(rows, cols));
	}
}
