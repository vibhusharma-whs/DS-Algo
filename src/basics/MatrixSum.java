//program to implement and use multidimensional array

package basics;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the rows and columns for the 		matrices");
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		
		System.out.println("Please enter values for first matrix");
		for (int i=0;i<rows;i++) {
			for (int j = 0;j<cols;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Please enter values for second matrix");
		for (int i=0;i<rows;i++) {
			for (int j = 0;j<cols;j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("below is the final matrix");
		for (int i=0;i<rows;i++) {
			for (int j = 0;j<cols;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}


	}

}
