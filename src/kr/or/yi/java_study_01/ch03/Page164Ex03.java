package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page164Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >>");
		star(sc);
		sc.close();
	}

	private static void star(Scanner sc) {
		int s = sc.nextInt();
		for (int i = 1; i < s + 1; i++) {
			for (int j = 0; j + i < s + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
