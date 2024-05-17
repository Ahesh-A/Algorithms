//Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 4

package ahesh.problems;

public class MaximalSquare {
	
	public static int getMinNeighbourhood(int rowIdx, int colIdx, int[][] arr ) {
		final int rowLength = arr.length;
		final int colLength = arr[0].length;
		
		int max = 0;
		
		if(colIdx + 1 < colLength && rowIdx < rowLength) {
			max = Integer.max(max, arr[rowIdx][colIdx + 1]);
		}
		
		if(rowIdx + 1 < rowLength && colIdx < colLength) {
			max = Integer.max(max, arr[rowIdx][colIdx]);
		}
		
		if(rowIdx + 1 < rowLength && colIdx + 1 < colLength) {
			max = Integer.max(max, arr[rowIdx][colIdx]);
		}
		
		return max;
	}
	
	public static void fillRow(int rowIdx, int colIdx, int[][] arr) {
		for(int j = colIdx; j >= 0; j--) {
			
		}
	}
	
	public static int getMaximalSquare(String [][] arr) {
		int max = 0;
		final int row = arr.length;
		final int col = arr[0].length;
		
		for(int i = row - 1; i >= 0; i--) {
			
		}
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
