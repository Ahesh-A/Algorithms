//Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
//
//The objective of the game is to end with the most stones. The total number of stones across all the piles is odd, so there are no ties.
//
//Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row. This continues until there are no more piles left, at which point the person with the most stones wins.
//
//Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.
//
// 
//
//Example 1:
//
//Input: piles = [5,3,4,5]
//Output: true
//Explanation: 
//Alice starts first, and can only take the first 5 or the last 5.
//Say she takes the first 5, so that the row becomes [3, 4, 5].
//If Bob takes 3, then the board is [4, 5], and Alice takes 5 to win with 10 points.
//If Bob takes the last 5, then the board is [3, 4], and Alice takes 4 to win with 9 points.
//This demonstrated that taking the first 5 was a winning move for Alice, so we return true.
//Example 2:
//
//Input: piles = [3,7,2,3]
//Output: true
package ahesh.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class StoneGame {
	public static Map<List<Integer>, Boolean> getKey(int sIdx, int eIdx, boolean add) {
		List<Integer> list = new ArrayList<>(2);
		Map<List<Integer>, Boolean> key = new HashMap<List<Integer>, Boolean>();
		
		list.add(sIdx);
		list.add(eIdx);
		
		key.put(list, add);
		
		return key;
	}
	
	public static int getMaxPile(int[] piles, Map<Map<List<Integer>, Boolean>, Integer> map, int sIdx, int eIdx, boolean add) {
		if(sIdx == eIdx) {
			return  add ? piles[sIdx] : -1 * piles[sIdx];
		}
		
		Map<List<Integer>, Boolean> key = getKey(sIdx, eIdx, add);
		
		if(map.containsKey(key)) {
			return map.get(key);
		}
		
		int startIdxSum;
		int endIdxSum;
		
		if(add) {
			 startIdxSum = getMaxPile(piles, map, sIdx + 1, eIdx, !add) + piles[sIdx];
			 endIdxSum = getMaxPile(piles, map, sIdx, eIdx - 1, !add) + piles[eIdx];
			 return Integer.max(startIdxSum, endIdxSum);
			 
		} else {
			startIdxSum = getMaxPile(piles, map, sIdx + 1, eIdx, !add) - piles[sIdx];
			endIdxSum = getMaxPile(piles, map, sIdx, eIdx - 1, !add) - piles[eIdx];
			return Integer.min(startIdxSum, endIdxSum);
		}
		
	}
	
	
	public static void main(String[] args) {
		Map<Map<List<Integer>, Boolean>, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		int[] piles = {3,7,2,3};
		
		int res = getMaxPile(piles, map, 0, piles.length - 1, true);
		System.out.println("Res: " + res);
	}
}
