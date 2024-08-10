package ahesh.problems;

import java.util.Arrays;

public class PartitionSum {
	
	
	public static boolean partitionExistOdd(int[] arr, int target, int sum, int idx) {
		if(idx == arr.length) {
			return false;
		}
		
		if (sum == target) {
			return true;
		}
		
		return partitionExistOdd(arr, target, sum + arr[idx], idx + 1) | partitionExistOdd(arr, target, sum, idx + 1);
	}
	
	
	public static boolean doesPartitionExist(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		
		if(sum % 2 != 0) {
			return false;
		}
		
		int target = sum / 2;
		
		if(arr.length % 2  != 0) {
			return partitionExistOdd(arr, target, 0, 0);
		}
		
		
		return partitionExistEven(arr, target, 0, 0, 0);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 3};
		
		System.out.println("Result: " + doesPartitionExist(arr));
		
	}
}
