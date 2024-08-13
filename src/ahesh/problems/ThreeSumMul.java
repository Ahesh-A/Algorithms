//923. 3Sum With Multiplicity
//Medium
//Topics
//Companies
//Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.
//
//As the answer can be very large, return it modulo 109 + 7.
//
// 
//
//Example 1:
//
//Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
//Output: 20
//Explanation: 
//Enumerating by the values (arr[i], arr[j], arr[k]):
//(1, 2, 5) occurs 8 times;
//(1, 3, 4) occurs 8 times;
//(2, 2, 4) occurs 2 times;
//(2, 3, 3) occurs 2 times.
//Example 2:
//
//Input: arr = [1,1,2,2,2,2], target = 5
//Output: 12
//Explanation: 
//arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
//We choose one 1 from [1,1] in 2 ways,
//and two 2s from [2,2,2,2] in 6 ways.
//Example 3:
//
//Input: arr = [2,1,3], target = 6
//Output: 1
//Explanation: (1, 2, 3) occured one time in the array so we return 1.

//Constraints:
//
//3 <= arr.length <= 3000
//0 <= arr[i] <= 100
//0 <= target <= 300
package ahesh.problems;

import java.util.Arrays;

public class ThreeSumMul {
	public static long[] getFrequency(int[] arr) {
		long [] res = new long[101];
		
		for(int i : arr) {
			res[i]++;
		}
		
		return res;
	}
	
	public static int threeSumMulti(int[] arr, int target) {
        long [] frequencyArr = getFrequency(arr);
//        System.out.println("Result: " + Arrays.toString(getFrequency(arr)));
        
        long res = 0;
        long mod = 1000000007;
        
        for(int i = 0; i < 101; i++) {
        	for(int j = i; j < 101; j++) {
        		
        		int k = target - i - j;
        		
        		if(k < 0 || k > 100) {
        			continue;
        		}
        		
        		if(i == j && j == k) {
        			long count = frequencyArr[i];
        			res = res + (count * (count - 1) * (count - 2))/ 6;
        		} else if(i == j && j != k) {
        			long count = frequencyArr[i];
        			res = res + ((count * (count - 1)) / 2) * frequencyArr[k];
        		} else if(i < k && j < k) {
        			res = res + frequencyArr[i] * frequencyArr[j] * frequencyArr[k];
        		}
        		
        		res %= mod;
        	}
        }
        return (int) res;
    }

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5,5};
		System.out.println("Solution: " + threeSumMulti(arr, 8));
	}
}
