package chapter1;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "VIBHUCV";
		System.out.println(checkUnique(str));
	}
	
	private static boolean checkUnique (String s) {
		// Set<Character> set = new HashSet<>();
//		for (char c: s.toCharArray()) {
//			if (set.contains(c)) {
//				return false;
//			}
//			set.add(c);
//		}
		if (s.length() > 256) return false;
		boolean[] char_Array = new boolean[256];
		
		for(int i = 0; i<s.length();i++) {
			
			int value = s.charAt(i);
			if(char_Array[value]) {
				return false;
			}
			char_Array[value] = true;
		}
		
		return true;
		
	}

}
