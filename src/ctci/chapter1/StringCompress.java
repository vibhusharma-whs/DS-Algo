package chapter1;

public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aaabbbbccccddaaaaaaaaaaaaa"));
		char[] chars = {'a','a','b','b','c','c','c'};
		//System.out.println(compress(chars));
	}
	
	public static String compress(String a) {
		
		char[] b = a.toCharArray();
		char c = b[0];
		int count = 0;
		String result = "";
		
		for(int i = 0; i<b.length;i++) {
			if(b[i] == c) {
				count++;
			} else {
				result = result+c+count;
				count = 1;
			}
			c = b[i];
			
		}
		result = result+c+count;
		
		return result;
	}

    public static int compress(char[] chars) {
        
        char a = chars[0];
        int count =0;
        int j = 0;
        for(int i = 0; i<chars.length;i++) {
            if(chars[i] == a) {
                count++;
            } else {
                chars[j] = a;
                chars[j+1] = (char)(count+'0');    
                j = j+2;
                count = 1;
            }
            a = chars[i];
        }
        System.out.println(count);
        chars[j] = a;  
        chars[j+1] = (char)(count+'0');   
        System.out.println(chars);
        
        return j+2;
    }
}
