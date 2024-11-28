package com.tcs.practice1;

import java.util.Scanner;

public class LatestVersionOfFiles {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//int n  =scan.nextInt();
		scan.close();
		
		String[] files = input.split(",");
		System.out.println(latestVersion(files));
	}
	
	public static int latestVersion(String[] files) {
		int version = 0;
		if(files.length == 0) {
			return -1;
		}
		for(String file : files) {
			String[] s = file.split("_");
			if(version < Integer.parseInt(s[1])) {
				version = Integer.parseInt(s[1]);
			}
		}
		return version;
	}

}
