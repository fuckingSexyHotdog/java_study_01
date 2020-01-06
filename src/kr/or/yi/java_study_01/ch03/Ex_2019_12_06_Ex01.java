package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Ex_2019_12_06_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex_1_A(sc);
		ex_1_B(sc);
		ex_1_C(sc);
		sc.close();
	}

	private static void ex_1_C(Scanner sc) {
		// 0을 입력하기 전까자의 입력된 정수의 합을 구하여라.
		int sum2 = 0;
		int cnt = 0;
		while (true) {
			System.out.println("정수를 입력해주세요. 0을 입력하시면 종료됩니다.");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("종료합니다.");
				break;
			}
			sum2 = sum2 + num2;
			cnt++;
		}
		System.out.println("입력하신 " + cnt + "개의 정수의 합은" + sum2 + "입니다.");
	}

	private static void ex_1_B(Scanner sc) {
		// 입력할 정수의 갯수를 지정하고 그 합을 구하여라.
		System.out.println("입력할 정수의 개수를 입력해주세요.");
		int num = sc.nextInt();
		int sum1 = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("정수를 입력해주세요.");
			int inNum = sc.nextInt();
			sum1 = sum1 + inNum;
		}
		System.out.println(num + "개의 정수의 합은 " + sum1 + "입니다.");
	}

	private static void ex_1_A(Scanner sc) {
		// 1~100까지의 정수들의 합을 구하여라.
		System.out.println("정수를 입력하세요.");
		int s = sc.nextInt();
		int f = sc.nextInt();
		int sum = 0;
		for (int i = s; i < f+1; i++) {
			sum = sum + i;
		}
		System.out.println(s+"부터~"+f+"까지의 정수들의 합은 : " + sum);
	}
}
