package Recursion;

public class SumOfNIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(500);
		System.out.println(result);
	}
	
	static int sum(int n) {
		if(n == 1) return 1;
		return sum(n-1) + n;
	}

}
