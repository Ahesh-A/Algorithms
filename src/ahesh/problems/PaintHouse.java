//Description
//There are a row of n houses, each house can be painted with one of the three colors: red, blue or green. 
//The cost of painting each house with a certain color is different. You have to paint all the houses such 
//that no two adjacent houses have the same color, and you need to cost the least. Return the minimum cost.
//
//The cost of painting each house with a certain color is represented by a n x 3 cost matrix. 
//For example, costs[0][0] is the cost of painting house 0 with color red; 
//costs[1][2] is the cost of painting house 1 with color green, and so on... Find the minimum cost to paint all houses.

//Input: [[14,2,11],[11,14,5],[14,3,10]]
//Output: 10
//Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue. Minimum cost: 2 + 5 + 3 = 10.


//Input: [[1,2,3],[1,4,6]]
//Output: 3

package ahesh.problems;

public class PaintHouse {
	public static int minCost(int[][] cost) {
		int red = 0;
		int green = 0;
		int blue = 0;
		
		for(int i = 0; i < cost.length; i++) {
			int preRed = cost[i][0] + Integer.min(green, blue);  
			int preGreen = cost[i][1] + Integer.min(red, blue);
			int preBlue = cost[i][2] + Integer.min(red, green);
			
			red = preRed;
			green = preGreen;
			blue = preBlue;
		}
		
		return (red < green) ? ((red < blue) ? red : blue) : ((green < blue) ? green : blue);
	}
	
	public static void main(String args[]) {
		int[][] cost = {{14, 2, 11},
						{11, 14, 5},
						{14, 3, 10},
						{1, 10, 5}};
		System.out.println("Result: " + minCost(cost));
	}
}
