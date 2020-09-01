package Recursion;

public class PathInNMGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int paths = path(10000,1);
		System.out.println(paths);
	}
	
	static int path(int n, int m) {
		if (n== 1 || m ==1) return 1;
		return path(n-1, m)+path(n, m-1);
	}

}
