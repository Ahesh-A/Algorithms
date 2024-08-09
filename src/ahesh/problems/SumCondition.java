package ahesh.problems;

import java.util.Arrays;

public class SumCondition {
	public static int getNoOfSequenceAddToTarget(int[] arr, int target) {
		int[] exp = new int[arr.length];
		exp[0] = 1;
		int res = 0;
		
		for(int i = 1; i < arr.length; i++) {
			exp[i] = (exp[i - 1] * 2) % 1000000007;
		}
		
		Arrays.sort(arr);
		
		int i = 0; 
		int j = arr.length - 1;
		
		while(i <= j) {
			if(arr[i] + arr[j] <= target) {
				res = (res + exp[j- i]) % 1000000007;
				i++;
			} else {
				j--;
			}
		}
		
		return res;
	}
	
	public static void main (String args[]) {
		int[] arr = {3, 5, 7, 2};
		int target = 9;
		System.out.println("Result: " + getNoOfSequenceAddToTarget(arr, target));
	}
}
