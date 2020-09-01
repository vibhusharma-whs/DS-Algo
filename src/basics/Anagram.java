package basics;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aac";
		String b = "act";

		boolean isAnagram = false;
		boolean[] isVisited = new boolean[a.length()];
		
		if (a.length() == b.length()) {
			for (int i = 0; i<a.length();i++) {
				isAnagram = false;
				for (int j = 0; j<b.length();j++) {
					if(a.charAt(i) == b.charAt(j) && !isVisited[j]) {
						isVisited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
			
			if (isAnagram) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagrams");
			}
		}

	}

}
