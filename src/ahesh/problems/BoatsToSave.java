package ahesh.problems;

import java.util.Arrays;

public class BoatsToSave {
	
	public static int getBoats(int[] arr, int limit) {
		int i = 0;
		int j = arr.length - 1;
		int count = 0;
		
		while(i <= j) {
			int sum = arr[i] + arr[j];
			
			if(sum <= limit) {
				i++;
				j--;
			} else {
				j--;
			}
			
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1};
		Arrays.sort(arr);
		System.out.println("Res: " + getBoats(arr, 2));
	}
}
