package ahesh.problems;

import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
	public static Integer getPascalRowValue(int i, int j, int rowSize, List<Integer> row) {
		if(i < 0 || j == rowSize) {
			return 1;
		}
		
		return row.get(i) + row.get(j);
	}
	
	public static List<Integer> getCurrentPascalRow(List<Integer> row) {
		Integer i = -1;
		Integer j = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		int rowSize = row.size();
		
		for(; i < rowSize; i++, j++) {
			list.add(getPascalRowValue(i, j, rowSize, row));
		}
		
		return list;
	}
	
	public static  List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> pascalsTrinagle = new ArrayList<>();
		 List<Integer> initialList = new ArrayList<Integer>();
		 initialList.add(1);
		 pascalsTrinagle.add(initialList);
		 
		 List<Integer> previousList = initialList;
		 
		 for(int i = 1; i < numRows; i++) {
			 previousList =  getCurrentPascalRow(previousList);
			 pascalsTrinagle.add(previousList);
		 }
		 return pascalsTrinagle;
	}	
	 
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Result: " + generate(num));
	}
}
