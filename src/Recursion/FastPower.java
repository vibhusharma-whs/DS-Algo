package Recursion;

public class FastPower {

	static int stepcount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fastPower(3, 10000);
		System.out.println(result);
		System.out.println("Steps taken: "+stepcount);
	}
	static int fastPower(int a , int b) {
		stepcount++;
		if (b == 0) return 1;
		if(b%2 == 0) {
			return fastPower(a*a, b/2);
		} else {
			return a*fastPower(a, b-1);
		}
	}

}
