package com.tcs.practice1;

import java.util.Scanner;

public class HalfPyramidUsingAlphabets {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int v ='A';
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print((char)v + " ");
			}
			v = (char)v+1;
			System.out.println();
		}
	}

}
