package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5이상인 홀수를 입력하시면 트리가 나옵니다!");
//		prettyTree(sc);
		diamond(sc);
		sc.close();
	}

	private static void diamond(Scanner sc) {
		int i = sc.nextInt();
		int j=0;
		while(j<i) {
			
		
		}
		
	}

	private static void prettyTree(Scanner sc) {
		int i = sc.nextInt();
		for(int j=0;j<((i+1)/2);j++) {
			for(int k=0;k<(((((i+1)/2))+1)-j);k++) {
				System.out.print(" ");
			}
			for(int k=0;k<((i-(i-1))+j+j);k++) {
				System.out.print("*");
			}
			for(int k=0;k<(((((i+1)/2))+1)-j);k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int j=0;j<((i+1)/2);j++) {
			for(int k=0;k<(((((i+1)/2)))-j);k++) {
				System.out.print(" ");
			}
			for(int k=0;k<((i-(i-1))+2+j+j);k++) {
				System.out.print("*");
			}
			for(int k=0;k<(((((i+1)/2)))-j);k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int j=0;j<(((i+1)/2)+1);j++) {
			for(int k=0;k<(((((i+1)/2)))-j);k++) {
				System.out.print(" ");
			}
			for(int k=0;k<((i-(i-1))+2+j+j);k++) {
				System.out.print("*");
			}
			for(int k=0;k<(((((i+1)/2)))-j);k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int j=0;j<3;j++) {
			for(int k=0;k<((i+1)/2);k++) {
				System.out.print(" ");
			}
			for(int k=0;k<3;k++) {
				System.out.print("*");
			}
			for(int k=0;k<((i+1)/2);k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
