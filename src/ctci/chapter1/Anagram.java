package chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("aman", "aamn"));
	}
	
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) return false;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < a.length(); i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
			map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0)-1);
		}
		
		for(char c: map.keySet()) {
			if (map.get(c) != 0) return false;
		}
		
		return true;
	} 

}
