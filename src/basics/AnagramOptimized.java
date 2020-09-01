package basics;

public class AnagramOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aat";
		String b = "act";
		
		boolean isAnagram = true;
		
		int[] al = new int[256];
		
		for (char c:a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for (char c:b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		
		for (int i=0;i<256;i++) {
			if(!(al[i] == 0)) {
				isAnagram = false;
			}
		}
		
		if(isAnagram) {
			System.out.println("Strings are anagrams.");
		} else {
			System.out.println("Strings are not anagrams.");
		}

	}

}
