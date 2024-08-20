package ahesh.problems;

import java.util.ArrayList;
import java.util.List;

public class PrintComb {
	
	public static void printComb(List<Integer> list, Integer[] arr, int idx, List<List<Integer>> ans, int k) {
		
		if(idx == arr.length) {
			if(list.size() == k) {				
				ans.add(new ArrayList<>(list));
//				System.out.println(list);
			}
			return;
		}
		
		list.add(arr[idx]);
		printComb(list, arr, idx + 1, ans, k);
		list.remove(list.size() - 1);
		printComb(list, arr, idx + 1, ans, k);
	}
	
	public static void main(String[] args) throws Exception {
		Integer [] arr = {1, 3 , 4, 2};
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		
		printComb(list, arr, 0, ans, );
		
		System.out.println(ans);
	}
}
