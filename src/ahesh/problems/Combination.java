package ahesh.problems;

public class Combination {
	
	public static void printComb(int[] arr, int idx, String str) {
		if(idx == arr.length) {
			System.out.println(str);
		}
		
		for(int i = idx; i < arr.length; i++) {
			printComb(arr, i + 1, str + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
	}
}
