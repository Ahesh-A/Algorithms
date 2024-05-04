package ahesh.problems;

public class JumpGame {
	public static boolean canJump(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i <= max; i++) {
			max = Integer.max(max, i + arr[i]);
			if(max >= arr.length - 1) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0};
		System.out.println("Result: " + canJump(arr));
	}
}	
