package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "ibhu");
		map.put(1, "Ishu");
		map.put(1, "radhika");
		map.put(3, "RAhul");
		
		System.out.println(map.getOrDefault(3, "Jerald"));
		
		map.forEach((k,v) -> System.out.println(k +" "+v));
		
		

	}

}
