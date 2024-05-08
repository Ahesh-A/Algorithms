//Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
//
//A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
//
//For example, "ace" is a subsequence of "abcde".
//A common subsequence of two strings is a subsequence that is common to both strings.
//
// 
//
//Example 1:
//
//Input: text1 = "abcde", text2 = "ace" 
//Output: 3  
//Explanation: The longest common subsequence is "ace" and its length is 3.

package ahesh.problems;

public class LongestCommonSubsequence {
	
	public static void addCharToStringBuilder(CharSequence c, StringBuilder sb) {
		int low = 0;
		int high = sb.length();
		
		while(low < high) {
			
		}
	}
	
	public static int lcu(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		
		for(int i = s1.length() - 1; i >= 0; i--) {
			for(int j = s2.length() - 1; j >= 0; j--) {
				
				if(s1.charAt(i) == s2.charAt(j) ) {
					dp[i][j] = 1 + dp[i + 1][j + 1];
				} else {
					dp[i][j] = Integer.max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		
		return dp[0][0];
		
	}
	
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ace";
		
		System.out.println("Result: " + lcu(s1, s2));
	}
}
