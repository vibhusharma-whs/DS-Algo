package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactors(36));

	}
	
	public static List<Integer> findFactors(int n) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int i = 1;i<Math.sqrt(n);i++) {
			if(n%i == 0) {
				if(i != Math.sqrt(n)) {
					result.add(i);
					result.add(n/i);
				} else {
					result.add(i);
				}
			}
		}
		return result;
	}

}
