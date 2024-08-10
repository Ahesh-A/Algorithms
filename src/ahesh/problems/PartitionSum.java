package ahesh.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionSum {
	
	public static void printPartition(int[] arr, List<Integer> list) {
		List<Integer> basket1 = new ArrayList<>();
		List<Integer> basket2 = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(list.contains(i)) {
				basket1.add(arr[i]);
			} else {
				basket2.add(arr[i]);
			}
		}
		
		System.out.println(basket1 + " | "  + basket2);
		
	}
	
	public static boolean partitionExistOdd(int[] arr, int target, int sum, int idx, List<Integer> list) {
		if(idx == arr.length) {
			return false;
		}
		
		if (sum == target) {
			printPartition(arr, list);
			return true;
		}
		
		list.add(idx);
		boolean include =  partitionExistOdd(arr, target, sum + arr[idx], idx + 1, list);
		list.remove(list.size() - 1);
		
		if(include) {
			return true;
		}
		
		boolean skip = partitionExistOdd(arr, target, sum, idx + 1, list);
		
		return skip;
	}
	
	public static boolean partitionExistEven(int[] arr, int target, int sum, int idx, int count, List<Integer> list) {
		if(idx == arr.length) {
			return false;
		}
		
		if(sum == target && count != arr.length / 2) {
			printPartition(arr, list);
			return true;
		}
		
		list.add(idx);
		boolean include = partitionExistEven(arr, target, sum + arr[idx], idx + 1, count + 1, list);
		list.remove(list.size() - 1);
		
		if(include) {
			return true;
		}
		
		boolean skip = partitionExistEven(arr, target, sum, idx + 1, count, list);
		
		return skip;
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
		int[] arr = {1, 2, 3, 3};
		
		System.out.println("Result: " + doesPartitionExist(arr));
		
	}
}
