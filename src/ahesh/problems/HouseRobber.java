//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.

package ahesh.problems;

public class HouseRobber {
	
	public static int getMaxProfit(int[] nums) {
		int pre = 0, cur = 0;
        for (int num : nums) {
            final int temp = Integer.max(pre + num, cur);
            pre = cur;
            cur = temp;
        }
        return cur;
	}
	
	public static void main(String[] args) {
		int[] money = {3, 1, 2, 100};
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < money.length; i+=2) {
			evenSum += money[i];
		}
		
		for(int i = 1; i < money.length; i+=2) {
			oddSum+= money[i];
		}
		
//		System.out.println("Result: " + Math.max(oddSum, evenSum));
		System.out.println("Result: " + getMaxProfit(money));
	}
}
