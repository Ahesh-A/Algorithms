//You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.
//
//Train tickets are sold in three different ways:
//
//a 1-day pass is sold for costs[0] dollars,
//a 7-day pass is sold for costs[1] dollars, and
//a 30-day pass is sold for costs[2] dollars.
//The passes allow that many days of consecutive travel.
//
//For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
//Return the minimum number of dollars you need to travel every day in the given list of days.
//
//Input: days = [1,4,6,7,8,20], costs = [2,7,15]
//Output: 11
//Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
//On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
//On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
//On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
//In total, you spent $11 and covered all the days of your travel

package ahesh.problems;

import java.util.HashMap;


public class MinCostTickets {
	
	public static int getMinCostHelper(int[] days, int[] cost, HashMap<Integer, Integer> map, int idx, int[] travel) {
		
		if(idx >= days.length) return 0;
		
		if(map.containsKey(idx)) return map.get(idx);
		
		map.put(idx, Integer.MAX_VALUE);
		
		for(int i = 0; i < travel.length; i++) {
			int j = idx;
			while( j < days.length && days[j] < days[idx] + travel[i]) j++;
			
			map.put(idx, Math.min(map.get(idx), cost[i] + getMinCostHelper(days, cost, map, j , travel))); 
		}
		
		return map.get(idx);
	}
	
	public static int getMinCost(int[] days, int[] cost, int idx) {
		HashMap<Integer, Integer> map = new HashMap<>();

		return getMinCostHelper(days, cost, map, 0, new int[] {1, 7, 30});
		
	}
	
	public static void main(String[] args) {
		int[] days = {1, 4, 6, 7, 8, 20};
		int[] cost = {2, 7, 15};
		
		System.out.println("Find min cost: " + getMinCost(days, cost, 0));
	}
}
