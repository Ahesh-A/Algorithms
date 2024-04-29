//Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
//
//An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:
//
//s = s1 + s2 + ... + sn
//t = t1 + t2 + ... + tm
//|n - m| <= 1
//The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
//Note: a + b is the concatenation of strings a and b.
//
// 
//
//Example 1:
//
//
//Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
//Output: true
//Explanation: One way to obtain s3 is:
//Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
//Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
//Since s3 can be obtained by interleaving s1 and s2, we return true.

package ahesh.problems;

import java.util.HashMap;
import java.util.Map;

public class InterleavingString {
	
	public static boolean isInterleavingString(String s1, String s2, String s3, int i, int j, Map<String, Boolean> cache) {
		
		String key = i + "" + j;
		System.out.println("Cache: " + cache);
		if(i == s1.length() && j == s2.length()) return true; 
		
		if(cache.containsKey(key)) return cache.get(key);
		 
		if(i < s1.length() && s1.charAt(i) == s3.charAt(i + j) && isInterleavingString(s1, s2, s3, i + 1, j, cache)) {
			return true;
		}
		
		if(j < s2.length() && s2.charAt(j) == s3.charAt(i + j) && isInterleavingString(s1, s2, s3, i, j + 1, cache)) {
			return true;
		}
		
		cache.put(key, false);
		
		return false;
		
	}
	public static boolean isInterleavingDp(String s1, String s2, String s3) {
		int lens1 = s1.length();
		int lens2 = s2.length();
		
		if(lens1 + lens2 != s3.length()) return false;
		
		boolean[][] dp = new boolean[lens1 + 1][lens2 + 1];
		
		dp[lens1][lens2] = true;
		
		for(int i = lens1; i >= 0 ; i--) {
			for(int j = lens2; j >= 0; j--) {
				
				if(i < lens1 && s3.charAt(i + j) == s1.charAt(i) && dp[i + 1][j]) {
					dp[i][j] = true;
				}
				
				if(j < lens2 && s3.charAt(i + j) == s2.charAt(j) && dp[i][j + 1]) {
					dp[i][j] = true;
				}
				
			}
		}
		
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		String s1 = "", s2 = "", s3 = "";
//		String s2 = "dbbca";
//		String s3 = "aadbbcbcac";
		
		System.out.println("Result: " + isInterleavingDp(s1, s2, s3));
	}
	
}
