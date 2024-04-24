package ahesh.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
	
	public static boolean isWordBreak(List<String> dictionary, String word) {
		StringBuilder sb = new StringBuilder(word);
		
		for(int i = 1; i <= sb.length(); i++) {
			String subString = sb.substring(0, i);
			if(dictionary.contains(subString)) {
				sb.replace(0, i, "");
				i = 0;
			}
		}
		return sb.toString().equals("");
	}
	
	public static void main(String[] args) {
		String word = "catsanddog";
		List<String> dictionary = Arrays.asList(new String[] {"cats","dog","sand","and","cat"});
		
		System.out.println("Result: " + isWordBreak(dictionary, word));
		
//		StringBuilder sb = new StringBuilder(word);
//		sb.replace(0, 3, "");
//		
//		System.out.println(sb);
	}
}
