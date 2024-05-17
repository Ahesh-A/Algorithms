//Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 4

package ahesh.problems;

public class MaximalSquare {
	
	public static void getMinNeighbourhood(int rowIdx, int colIdx) {
		
	}
	
	public static void fillRow(int rowIdx, int colIdx) {
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
