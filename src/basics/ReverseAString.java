package basics;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'H','a','t','n','k','l'};
		System.out.println(s);
        for (int i = 0;i<s.length;i++) {
            char temp = '0';
            int j = s.length-1-i;
            if(i == j || i==s.length/2)
                break;
            temp = s[i];
            s[i] = s[j];
            s[j]= temp;
            System.out.println(s);
        }
        

	}

}
