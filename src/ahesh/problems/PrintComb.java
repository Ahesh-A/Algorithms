package ahesh.problems;

import java.util.ArrayList;
import java.util.List;

public class PrintComb {
	
	public static void printComb(List<Integer> list, Integer[] arr, int idx) {
		if(idx == arr.length) {
			System.out.println(list);
			return;
		}
		
		list.add(arr[idx]);
		printComb(list, arr, idx + 1);
		list.remove(list.size() - 1);
		printComb(list, arr, idx + 1);
	}
	
	public static void main(String[] args) throws Exception {
		Integer [] arr = {1, 3 , 4, 2};
		List<Integer> list = new ArrayList<Integer>();
		printComb(list, arr, 0);
	}
}
