package ahesh.problems;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	public static int getDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i : arr) {
			if(set.contains(i)) {
				return i;
			} else {
				set.add(i);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 5, 4, 6, 6, 7};
		System.out.println(getDuplicate(arr));
	}
}
