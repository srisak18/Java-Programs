package com.tcs.practice1;

import java.util.Scanner;

public class FullPyramidUsingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			int x=i;
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			
			for(int j=x; j<i+x; j++) {
				System.out.print(j + " ");
			}
			
			for(int j=x; j<i+x-1; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
