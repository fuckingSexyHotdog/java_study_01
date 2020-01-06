package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Ex_2019_12_06_Ex04 {
	public static void main(String[] args) {
		// 반복문을 통해 패턴을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		ex_4_A(num);
		ex_4_B(num);
		ex_4_C(num);
		sc.close();
	}

	private static void ex_4_B(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	private static void ex_4_C(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j + i < num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	private static void ex_4_A(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
