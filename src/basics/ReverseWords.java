package basics;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide your string.");
		
		String input = sc.nextLine();
		
		String[] output = input.split(" ");
		

		
		for (int i =output.length-1;i>=0;i--) {
			if (!output[i].isBlank()) {
				System.out.print(output[i]+" ");
			}
		}

	}

}
