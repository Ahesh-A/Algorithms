package ahesh.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
	
	public static boolean isWordBreak(List<String> dictionary, String word) {
		StringBuilder sb = new StringBuilder(word);
		
		for(int i = 0; i <= word.length(); i++) {
			String subString = sb.substring(0, i);
			if(dictionary.contains(subString)) {
				sb.replace(0, i, "");
			}
		}
		return sb.toString().equals("");
	}
	
	public static void main(String[] args) {
		String word = "applepenapple";
		List<String> dictionary = Arrays.asList(new String[] {"apple", "pen"});
		
//		System.out.println("Result: " + isWordBreak(dictionary, word));
		
		StringBuilder sb = new StringBuilder(word);
//		System.out.println(sb.substring(0, word.le));
	}
}
