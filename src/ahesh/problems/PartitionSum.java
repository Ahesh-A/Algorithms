package ahesh.problems;

import java.util.Arrays;

public class PartitionSum {
	
	public static boolean doesPartitionExist(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		
		if(sum % 2 != 0) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 3};
		
		
		
	}
}
