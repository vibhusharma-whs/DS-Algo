package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="";
		System.out.println("Please enter your string");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			char[] try1 = input.toCharArray();
			for (int i = try1.length-1; i>=0;i--) {
				System.out.print(try1[i]);
			}
		}
		catch (IOException e){
			e.printStackTrace();
			
		}

	}

}
