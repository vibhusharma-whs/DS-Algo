package Recursion;

public class CalculatePower {
	
	static int stepcount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = power(3,10000);
		System.out.println(result);
		System.out.println("Steps taken: "+stepcount);
	}
	
	static int power(int a, int b) {
		stepcount++;
		if (b == 0) return 1;
		return a*power(a, b-1);
	}

}
