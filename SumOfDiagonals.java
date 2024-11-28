package sam1_L1;

import java.util.Scanner;

public class SumOfDiagonals {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		sumOfDiagonals(a);
	}
	
	public static void sumOfDiagonals(int[][] a) {
		int sum1 =0, i=0, j=0;
		while(i<a.length && j<a[i].length) {
			sum1 += a[i++][j++];
		}
		
		int sum2=0;
		i=0;
		j=a[i].length-1;
		while(i<a.length && j>=0) {
			sum2 += a[i++][j--];
		}
		
		System.out.println("Sum of Primary Diagonal: " + sum1);
		System.out.println("Sum of Secondary Diagonal: " + sum2);
	}

}
