//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//0 <= j <= nums[i] and
//i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
//
// 
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
package ahesh.problems;

import java.util.Arrays;

public class Jump2 {
//	public static void fillIdxWithVal(int[] temp, int val, int startIdx, int endIdx) {
//		for(int i = startIdx; i <= endIdx; i++) {
//			temp[i] = val;
//		}
//		
//		System.out.println(Arrays.toString(temp));
//	}
	public static int getMinJumps(int[] nums) {
		  int jump = 0; 
	        int max = 0; 
	        int curMax = 0 ; 

	        for (int i = 0; i < nums.length - 1; i++){
	            max = Math.max(max, i+nums[i]);
	            if (i == curMax){
	                curMax = max; 
	                jump++; 
	                if (max >= nums.length-1){
	                    return jump; 
	                }
	            }
	        }
	        return jump; 
	}
	
	public static void main(String[] args) {
		int[] jump = {0}; // [7,0,9,6,9,6,1,7,9,0,1,2,9,0,3] ans: 2
		System.out.println("Result: " + getMinJumps(jump));
	}
}
