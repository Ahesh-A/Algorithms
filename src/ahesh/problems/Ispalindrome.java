//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.

package ahesh.problems;

public class Ispalindrome {
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j) {
			
			while(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && !(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				i++;
			}
			while(!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && !(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')) {
				j--;
			}
			
			if(i < j) {
				char a = s.charAt(i);
				char b = s.charAt(j);
				if(a >= 'A' && a <= 'Z') {
					a =(char) (a + 32);
				}
				if(b >= 'A' && b <= 'Z') {
					b = (char)(b + 32);
				}
				if(a != b) {					
					return false;
				}
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "m alayal + am ";
		System.out.println("Result: " + isPalindrome(s));
	}
}
