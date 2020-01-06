package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page165Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		won(sc, unit);
		sc.close();
	}

	private static void won(Scanner sc, int[] unit) {
		System.out.print("금액을 입력하세요.");
		int don = sc.nextInt();
		int don2 = don;
		for (int i = 0; i < unit.length; i++) {
			if (don2 / unit[i] != 0) {
				System.out.printf("%5d원 짜리 %d개%n", unit[i], (don2 / unit[i]));
				don2 = don2 % unit[i];
			}
		}
	}
}
