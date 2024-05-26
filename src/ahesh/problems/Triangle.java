//Given a triangle array, return the minimum path sum from top to bottom.
//
//For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
//
// 
//
//Example 1:
//
//Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//Output: 11
//Explanation: The triangle looks like:
//   2
//  3 4
// 6 5 7
//4 1 8 3
//The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

package ahesh.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	
	public static void updateTempArr(List<Integer> triangle, List<Integer> temp) {
		for(int i = 0; i < triangle.size(); i++) {
			temp.set(i, Integer.min(triangle.get(i) + temp.get(i), triangle.get(i) + temp.get(i + 1)));
		}
	}
	
	public static int getMinPath(List<List<Integer>> triangle) {
		List<Integer> temp = new ArrayList(triangle.get(triangle.size() - 1));
		
		for(int i = triangle.size() - 2; i >= 0; i--) {
			List<Integer> triangleArray = triangle.get(i);
			updateTempArr(triangleArray, temp);
		}
		
		return temp.get(0);
	}
	
	public static List<List<Integer>>  get2DArrayList(Integer[][] arr) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		for(Integer[] element : arr) {
			list.add(Arrays.asList(element));
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		Integer[][] arr = {
					{2},
					{3, 4},
					{6, 5, 7},
					{4, 1, 8, 3}};
		
		List<List<Integer>> triangle = get2DArrayList(arr);
		
		System.out.println("Result: " + getMinPath(triangle));
	}
}
