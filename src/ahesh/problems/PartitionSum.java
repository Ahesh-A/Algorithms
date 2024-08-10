package ahesh.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionSum {
	
	
	
	public static boolean partitionExistOdd(int[] arr, int target, int sum, int idx, List<Integer> list) {
		if(idx == arr.length) {
			return false;
		}
		
		if (sum == target) {
			System.out.println(list);
			return true;
		}
		
		list.add(idx);
		boolean include =  partitionExistOdd(arr, target, sum + arr[idx], idx + 1, list);
		list.remove(list.size() - 1);
		boolean skip = partitionExistOdd(arr, target, sum, idx + 1, list);
		
		return include | skip;
	}
	
	public static boolean partitionExistEven(int[] arr, int target, int sum, int idx, int count, List<Integer> list) {
		if(idx == arr.length) {
			return false;
		}
		
		if(sum == target && count != arr.length / 2) {
			System.out.println(list);
			return true;
		}
		
		list.add(idx);
		boolean include = partitionExistEven(arr, target, sum + arr[idx], idx + 1, count + 1, list);
		list.remove(list.size() - 1);
		boolean skip = partitionExistEven(arr, target, sum, idx + 1, count, list);
		
		return include | skip;
	}
	
	public static boolean doesPartitionExist(int[] arr) {
		int sum = Arrays.stream(arr).sum();
	
		if(sum % 2 != 0) {
			return false;
		}
		
		int target = sum / 2;
		
		if(arr.length % 2  != 0) {
			return partitionExistOdd(arr, target, 0, 0, new ArrayList<>());
		}
		
		
		return partitionExistEven(arr, target, 0, 0, 0, new ArrayList<>());
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 4};
		
		System.out.println("Result: " + doesPartitionExist(arr));
		
	}
}
