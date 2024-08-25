package ahesh.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
		public static void swap(int i, int j, Integer[] arr) {
			if (i == j) return;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		public static void getPermutationList(int idx, Integer[] arr, List<List<Integer>> res){
			if(idx == arr.length) {
				System.out.print(Arrays.toString(arr));
				res.add(new ArrayList<>(Arrays.asList(arr)));
				return;
			}
			
			for(int i = idx; i < arr.length; i++) {
				swap(idx, i, arr);
				getPermutationList(idx + 1, arr, res);
				swap(idx, i, arr);
			}
			
		}
		
		public static void main(String[] args) {
			Integer[] arr = {1, 2, 3};
			List<List<Integer>> list = new ArrayList<>();
			getPermutationList(0, arr, list);
			System.out.println("Result: " + list);
		}
}
