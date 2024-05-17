//Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 4

package ahesh.problems;

import java.util.Arrays;

public class MaximalSquare {
	
	public static void insertHandler(int rowIdx, int colIdx, char[][] arr) {
		if(arr[rowIdx][colIdx] != '0') {
			arr[rowIdx][colIdx] = (char)(getMinNeighbourhood(rowIdx, colIdx, arr) + 1);
		}
	}
	
	public static int getMinNeighbourhood(int rowIdx, int colIdx, char[][] arr ) {
		final int rowLength = arr.length;
		final int colLength = arr[0].length;
		
		int max = 0;
		
		if(colIdx + 1 < colLength && rowIdx < rowLength) {
			max = Integer.max(max, arr[rowIdx][colIdx + 1] - '0');
		}
		
		if(rowIdx + 1 < rowLength && colIdx < colLength) {
			max = Integer.max(max, arr[rowIdx][colIdx] - '0');
		}
		
		if(rowIdx + 1 < rowLength && colIdx + 1 < colLength) {
			max = Integer.max(max, arr[rowIdx][colIdx] - '0');
		}
		
		return max;
	}
	
	public static void fillRow(int rowIdx, int colIdx, char[][] arr) {
		for(int j = colIdx; j >= 0; j--) {
			
		}
	}
	
//	public static int getMaximalSquare(char[][] arr) {
//		int max = 0;
//		final int row = arr.length;
//		final int col = arr[0].length;
//		
//		for(int i = row - 1; i >= 0; i--) {
//			
//		}
//		return max
//	}
	
	public static void main(String[] args) {
		char [][] arr = {
				{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}
		};
		
//		System.out.println(Arrays.deepToString(arr));
		System.out.println((char)('1' + 1));
//		System.out.println("Result: " + getMaximalSquare(arr));
	}
}
