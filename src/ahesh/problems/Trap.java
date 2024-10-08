//42. Trapping Rain Water
//Hard
//Topics
//Companies
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//
// 
//
//Example 1:
//
//
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9

package ahesh.problems;

public class Trap {
	
	public static int trap(int[] height) {
		int arrLen = height.length;
		int[] leftMax = new int[arrLen];
		int[] rightMax = new int[arrLen];
		int res = 0;
		int max = height[0];
		
		for(int i = 0; i < arrLen; i++) {
			if(max < height[i]) {
				max = height[i];
			}
			
			leftMax[i] = max;
		}
		max = height[arrLen - 1];
		
		for(int i = arrLen - 1; i >= 0; i--) {
			if(max < height[i]) {
				max = height[i];
			}
			
			rightMax[i] = max;
		}
		
		for(int i = 0; i < arrLen; i++) {
			res += (Integer.min(leftMax[i], rightMax[i]) - height[i]) ;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Result: " + trap(arr));
	}
}
