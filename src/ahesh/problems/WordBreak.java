package ahesh.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
	
	public static boolean isWordBreak(List<String> dictionary, String word) {
		StringBuilder sb = new StringBuilder(word);
		boolean[] dp = new boolean[word.length() + 1];
		dp[word.length()] = true;
		
		for(int i = sb.length() - 1; i >= 0 ; i--) {
			
			for(String  wrd : dictionary) {
				if(i + wrd.length() - 1 < word.length() && wrd.equals(sb.substring(i, i + wrd.length()))) {
					dp[i] = dp[i + wrd.length()];
					if(dp[i]) break;
				}
			}
			
		}
		System.out.println("DP: " + Arrays.toString(dp));
		return dp[0];
	}
	
	public static void main(String[] args) {
		String word = "abcd";
		List<String> dictionary = Arrays.asList(new String[] {"a","abc","b","cd"});
		
		for(String s : dictionary) {
			System.out.println(s);
			if(s == "b") {
				
				break;
			}
		}
//		System.out.println("Result: " + isWordBreak(dictionary, word));
		
//		StringBuilder sb = new StringBuilder(word);
//		sb.replace(0, 3, "");
//		
//		System.out.println(sb);
	}
}
