package com.tcs.practice1;

import java.util.Scanner;

public class HalfPyramidUsingNumbers {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
