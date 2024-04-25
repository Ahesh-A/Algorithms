//Given a string s, return the longest palindromic substring in s.
//
// 
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

package ahesh.problems;

public class LongestPalindromicSubString {
	
	public static String getLongestPalindromicSubString(String charSeq) {
		String result = "";
		int start;
		int end;
		
		for(int i = 0; i < charSeq.length(); i++) {
			start  = i;
			end = i;
			
			while(start >= 0 && end < charSeq.length()) {
				if(charSeq.charAt(start) == charSeq.charAt(end)) {
					if(end - start + 1 > result.length()) {
						result = charSeq.substring(start, end + 1);
					}
					start --;
					end ++;
				} else break;
			}
			
			start = i;
			end = i + 1;
			
			while(start >= 0 && end < charSeq.length()) {
				if(charSeq.charAt(start) == charSeq.charAt(end)) {
					if(end - start + 1 > result.length()) {
						result = charSeq.substring(start, end + 1);
					}
					start --;
					end ++;
				} else break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String charSeq = "maam";
		System.out.println("Result: " + getLongestPalindromicSubString(charSeq));
	}
}
