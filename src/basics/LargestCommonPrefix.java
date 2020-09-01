package basics;

public class LargestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"flowers","flower","flight"};
		
		
		String result = "";
		
		String prefix = strs[0];
		
		for (int i = 1; i<strs.length;i++) {
			result = "";
			for (int j = 0; j<prefix.length();j++) {
				if(j == strs[i].length())
					break;
				if(prefix.charAt(j) == strs[i].charAt(j) ) {
					result = result + strs[i].charAt(j);
					System.out.println("result value is : "+result);
				} else {
					break;
				}
			}
			prefix = result;
			System.out.println("The value of prefix at the end of loop : "+prefix);
		}
		
		System.out.println(result);
	}

}
