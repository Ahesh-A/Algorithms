package ahesh.problems;

import java.util.List;
import java.util.ArrayList;

public class PrintComb {
	public static void printComb(int[] arr, List<Integer> list, int idx) {
		
		if(arr.length == idx) {
			System.out.println(list);
		}
		
		for(int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			printComb(arr, list , i + 1);
			list.remove(list.size() - 1);
			printComb(arr, list, i + 1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		printComb(arr, new ArrayList<Integer>(), 0);
	}
}
