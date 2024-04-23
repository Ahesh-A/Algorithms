package ahesh.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
	

	public static void main(String[] args) {
		String word = "applepenapple";
		List<String> dictionary = Arrays.asList(new String[] {"apple", "pen"});
		
//		System.out.println("Result: " + isWordBreak(dictionary, word));
		
		StringBuilder sb = new StringBuilder(word);
		System.out.println(sb.substring(0, word.le));
	}
}
