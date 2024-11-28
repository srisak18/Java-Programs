package com.tcs.practice1;

import java.util.Scanner;

public class CountSecondLargest {
	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println(countSecondLargest(a));
	}
	
	public static int secondLargest(int[] a) {
		int m1=Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
		for(int x : a) {
			if(m1 < x) {
				m2 = m1;
				m1 = x;
			}
			else if(m2 < x && m1 != x) {
				m2 = x;
			}
		}
		return m2;
	}

	public static int countSecondLargest(int[] a) {
		int sl = secondLargest(a);
		int count=0;
		for(int x : a) {
			if(sl == x) {
				count++;
			}
		}
		return count;
	}
}
