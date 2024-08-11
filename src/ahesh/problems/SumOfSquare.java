//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//
// 
//
//Example 1:
//
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//
//Input: c = 3
//Output: false

package ahesh.problems;

public class SumOfSquare {
	public static int getRight(int target) {
		long left = 0;
		long right = target;
		long mid = -1;
		
		while (left <= right) {
			mid = left + (right - left) / 2;
			long val = mid * mid;
			
			if(val == target) {
				return (int)mid;
			} else if(val < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return (int)right;
	}
	
	public static boolean isIntegerSumExist(int target) {
		long right = (int)Math.sqrt(target);
		long left = 0;
//		System.out.println(target+ " " + getRight(target));
		while(left <= right) {
			long num = left * left + right * right;
//			System.out.println(num == target);
			System.out.println(num + " " + target);
//			break;
			if( num == target) {
				return true;
			} else if(num < target) {
				left ++;
			} else {
				right --;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Result: " + isIntegerSumExist(2147483600));
	}
}
