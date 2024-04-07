//You are given an integer array nums and an integer target.
//
//You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
//
//For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
//Return the number of different expressions that you can build, which evaluates to target.

//Input: nums = [1,1,1,1,1], target = 3
//Output: 5
//Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
//-1 + 1 + 1 + 1 + 1 = 3
//+1 - 1 + 1 + 1 + 1 = 3
//+1 + 1 - 1 + 1 + 1 = 3
//+1 + 1 + 1 - 1 + 1 = 3
//+1 + 1 + 1 + 1 - 1 = 3

package ahesh.problems;

public class TargetSum {
	public static int getValue(int target, int sum) {
		
		if(target == sum) return 1;

		return 0;
	}
	
	public static int getPermutationsForTarget(int[] arr, int target, int idx, int sum) {
		if(idx == arr.length - 1) {
			return getValue(target, sum);
		}
		
		return getPermutationsForTarget(arr, target, idx + 1, sum - arr[idx + 1]) + getPermutationsForTarget(arr, target, idx + 1, sum + arr[idx + 1]);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2};
		
		System.out.println("No.of.different exp: " + getPermutationsForTarget(arr, 1, -1, 0));
	}
}
