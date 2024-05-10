package ahesh.problems;

public class MaximumProductSubArray {
	
	public static int maxProduct(int[] arr) {
		int curMax = 1;
		int curMin = 1;
		int res = arr[0];
		for(int i : arr) {
			int max = i * curMax;
			int min = i * curMin;
			curMax = Integer.max(Integer.max(max, min), i);
			curMin = Integer.max(Integer.max(max, min), i);
			
			res = Integer.max(Integer.max(curMax, curMin), res);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, -2, 4};
		System.out.println("Result: " + maxProduct(arr));
	}
}
