package ahesh.problems;

import java.util.HashMap;

public class DecodeWays {
	
	public static boolean validateString(String s) {
		
		return s.charAt(0) != '0' &&  Integer.parseInt(s) > 0 && Integer.parseInt(s) <= 26;
	}
	
	public static int singleSlice(String s, HashMap<String, Integer> cache) {
		
		if(s.length() >= 1 && validateString(s.substring(0, 1))) {
			
			return noOfWaysToDecode(s.substring(1, s.length()), cache);
		}
		
		return 0;
		
	}
	
	public static int doubleSlice(String s, HashMap<String, Integer> cache) {
		if(s.length() >= 2 && validateString(s.substring(0, 2))) {
			
			return noOfWaysToDecode(s.substring(2, s.length()), cache);
		}
		
		return 0;
	}
	
	public static int noOfWaysToDecode(String s, HashMap<String, Integer> cache) {
		
		if(cache.containsKey(s)) return cache.get(s);
		
		if(s.equals("")) return 1;	
		
		int res = singleSlice(s, cache) + doubleSlice(s, cache);
		cache.put(s, res);
		
		return res;
	}
	
	public static void main(String[] args) {
		String s = "111111111111111111111111111111111111111111111"; //1836311903
		System.out.println("Result: " + noOfWaysToDecode(s, new HashMap<String, Integer>()));
		
	}
}
