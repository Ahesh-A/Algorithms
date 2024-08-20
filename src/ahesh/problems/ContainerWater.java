//11. Container With Most Water
//Solved
//Medium
//Topics
//Companies
//Hint
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//
// 
//
//Example 1:
//
//
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:
//
//Input: height = [1,1]
//Output: 1
package ahesh.problems;

public class ContainerWater {
	public static int maxArea(int[] height) {
		int res = 0;
		int i = 0;
		int j = height.length - 1;
		
		while(i < j) {
			int area = (j - i) * (Integer.min(height[i], height[j]));
			if(res < area) {
				res = area;
			}
			
			if(height[i + 1] < height[j - 1]) {
				j--;
			}else {
				i++;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println("Result: " + maxArea(arr));
	}
}
