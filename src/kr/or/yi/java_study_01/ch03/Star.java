package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
//		star(i);
		reverseStar(i);
	}

	private static void reverseStar(int i) {
		for(int x=0;x<i;x++) {
			for(int y=0;y<x;y++) {
				System.out.print(" ");
			}
			for(int y=i;y>x;y--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

	private static void star(int i) {
		for(int x=0;x<i;x++) {
			for(int y=i;y>x+1;y--) {
				System.out.print(" ");
			}
			for(int y=0;y<x+1;y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
