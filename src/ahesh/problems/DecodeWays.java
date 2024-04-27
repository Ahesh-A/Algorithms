package ahesh.problems;

public class DecodeWays {
	
	public static boolean validateString(String s) {
		return s.charAt(0) != '0' &&  Integer.parseInt(s) > 0 && Integer.parseInt(s) <= 26;
	}
	
	public static int singleSlice(String s) {
		
		if(s.length() >= 1 && validateString(s.substring(0, 1))) {
//			System.out.println("Validated for length 1");
			return noOfWaysToDecode(s.substring(1, s.length()));
		}
		
		return 0;
		
	}
	
	public static int doubleSlice(String s) {
		if(s.length() >= 2 && validateString(s.substring(0, 2))) {
//			System.out.println("Validated for length 245w");
			return noOfWaysToDecode(s.substring(2, s.length()));
		}
		
		return 0;
	}
	
	public static int noOfWaysToDecode(String s) {
		
		System.out.println("String :" + s);
		if(s.equals("")) return 1;	
		
		
		return singleSlice(s) + doubleSlice(s);
		
		
	}
	
	public static void main(String[] args) {
		String s = "11106";
		System.out.println("Result: " + noOfWaysToDecode(s));
		
//		System.out.println("Result: " + singleSlice("6"));
	}
}
