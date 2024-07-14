package ahesh.problems;

import java.util.List;
import java.util.ArrayList;

public class Version {
	
	public static List<Integer> split(String s, char seperator) {
		List<Integer> res = new ArrayList<>();
		StringBuilder elem = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			
			if(character != seperator) {
				elem.append(character);
			}else {
				res.add(Integer.valueOf(elem.toString()));
				elem = new StringBuilder();
			}
		}
		
		res.add(Integer.valueOf(elem.toString()));
		
		return res;
	}
	
	public static void main(String[] args) {
		String v1 = "1";
		String v2 = "1.00001.9";
		
		List<Integer> version1 = split(v1, '.');
		List<Integer> version2 = split(v2, '.');
		
//		System.out.println(version1);
//		System.out.println(version2);
		
		int size = Integer.min(version1.size(), version2.size());
		for(int i = 0; i < size; i++) {
			int ve1 = version1.remove(0);
			int ve2 = version2.remove(0);
			
			System.out.println(ve1 +", " + ve2);
			if(ve1 > ve2) {
				System.out.println("downgraded");
				return;
			}
			
			if(ve1 < ve2){
				System.out.println("upgraded");
				return;
			}
			
		}
		
		if(!version1.isEmpty()) {
			System.out.println("downgraded");
			return;
		} 
		
		if(!version2.isEmpty()) {
			System.out.println("upgraded");
			return;
		}
		
		System.out.println("Equal");
	}
}
