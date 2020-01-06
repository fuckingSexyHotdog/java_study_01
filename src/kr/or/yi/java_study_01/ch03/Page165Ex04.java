package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page165Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오.");
		alpha(sc);
		sc.close();
	}

	private static void alpha(Scanner sc) {
		String s = sc.next();
		char c = s.charAt(0);
		for (int i = 97; i < c + 1; i++) {
			for (int j = 0; j + i < c + 1; j++) {
				System.out.print((char) ('a' + j));
			}
			System.out.println("");
		}
	}
}
