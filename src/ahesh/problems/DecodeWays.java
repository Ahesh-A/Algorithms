package ahesh.problems;

public class DecodeWays {
	
	public static boolean validateString(String s) {
		return s.charAt(0) != '0' &&  s.compareTo("0") > 0 && s.compareTo("26") <= 0;
	}
	
	public static int noOfWaysToDecode(String s) {
		int result = 0;
		// sepearte single 
		if(validateString(s.substring(0, 1))) {
			result += noOfWaysToDecode(s.substring(1, s.length()));
		}
		result += noOfWaysToDecode(s);
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "";
//		System.out.println("Result: " + noOfWaysToDecode(s));
		System.out.println("Result: " + validateString("60"));
	}
}
