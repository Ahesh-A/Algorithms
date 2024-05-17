//Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 4

package ahesh.problems;

import java.util.Arrays;

public class MaximalSquare {
	
	public static int insertHandler(int rowIdx, int colIdx, char[][] arr) {
		int minNeighbourhood = getMinNeighbourhood(rowIdx, colIdx, arr);
		
		if(arr[rowIdx][colIdx] != '0' && minNeighbourhood != 0) {
			arr[rowIdx][colIdx] += minNeighbourhood;
		}
	
		return arr[rowIdx][colIdx] - '0';
	}
	
	public static int getMinNeighbourhood(int rowIdx, int colIdx, char[][] arr ) {
		final int rowLength = arr.length;
		final int colLength = arr[0].length;
		
		if(colIdx + 1 == colLength || rowIdx+ 1 == rowLength) return 0;
		
		int min = Integer.max(rowLength, colLength);
		
		min = Integer.min(min, arr[rowIdx][colIdx + 1] - '0');
		min = Integer.min(min, arr[rowIdx + 1][colIdx] - '0');
		min = Integer.min(min, arr[rowIdx + 1][colIdx + 1] - '0');
		
		
		return min;
	}
	
	public static int fillRow(int rowIdx, int colIdx, char[][] arr) {
		int max = 0;
		for(int j = colIdx; j >= 0; j--) {
			max  = Integer.max(max, insertHandler(rowIdx, j, arr));
		}
		
		return max;
	}
	
	public static int getMaximalSquare(char[][] arr) {
		int max = 0;
		final int row = arr.length;
		final int col = arr[0].length;
		
		for(int i = row - 1; i >= 0; i--) {
			max = Integer.max(max, fillRow(i, col - 1, arr));
			System.out.println("max: " + max);
		} 
		
		return max;
	}
	
	public static void main(String[] args) {
		char [][] arr = {
				{'1','0','1','0','0'},
				{'1','0','1','0','1'},
				{'1','1','1','1','1'},
				{'1','0','1','1','1'}
		};
		
		System.out.println("Result: " + getMaximalSquare(arr));
		System.out.println(Arrays.deepToString(arr));
	}
}
