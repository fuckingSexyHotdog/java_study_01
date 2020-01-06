package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while (res < 3) {
			if (res == 1) {
				System.out.println("for");
				ex_for(sc);
			} else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");

		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res = 2;
		int i = 0;
		while (res != 4) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch (res) {
			case 1:
				gugudan_while();
				break;
			case 2:
				factorail_while(sc);
				break;
			case 3:
				fibonacii_while(sc);
				break;
			default:
				System.out.println("while 문 종료");
			}
			i++;
		}
		System.out.println("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
	}

	private static void ex_for(Scanner sc) {
		int res = 1;
		for (int i = 0; res != 4; i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch (res) {
			case 1:
				gugudan_for();
				break;
			case 2:
				factorail_for(sc);
				break;
			case 3:
				fibonacii_for(sc);
				break;
			default:
				System.out.println("for 문 종료");
			}
		}
		// for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for(Scanner sc) {
		System.out.println("fibonacii_for()");
		int i = sc.nextInt();
		String sum = "";
		int x0 = 0;
		int x1 = 1;
		if (i == 0) {
			System.out.print("0");
		} else {
			System.out.print("0 + 1");
			for (int j = 1; j < i; j++) {
				int x2 = 0;
				x2 = x1 + x0;
				x0 = x1;
				x1 = x2;
				System.out.print(" + " + x2);
			}
			System.out.println(" 에서 피보나치 수열 " + i + "번째 수는 " + x1 + " 입니다.");
		}
	}

	private static void fibonacii_while(Scanner sc) {
		System.out.println("factorail_for()");
		int i = sc.nextInt();
		int x0 = 0;
		int x1 = 1;
		int x2 = 0;
		int j = 2;
		System.out.print("0, 1");
		while (j < i + 1) {
			x2 = x1 + x0;
			x0 = x1;
			x1 = x2;
			j++;
			System.out.print(", " + x1);
		}
		System.out.println(" 에서 피보나치 수열 " + i + "번째 수는 " + x1 + " 입니다.");
	}

	private static void factorail_for(Scanner sc) {
		System.out.println("factorail_for()");
		int i = sc.nextInt();
		int sum = 1;
		System.out.printf("%d! =", i);
		for (int j = 1; j < i + 1; j++) {
			sum = sum * j;
			System.out.printf(" %d %s", j, j == i ? "=" : "*");
		}
		System.out.println(" " + sum);
	}

	private static void factorail_while(Scanner sc) {
		System.out.println("factorail_for()");
		int o = sc.nextInt();
		int sum = 1;
		int j = 1;
		System.out.print(o + "!= ");
		while (j < o + 1) {
			sum = sum * j;
			System.out.print(j + (j != o ? " * " : " = "));
			j++;
		}
		System.out.println(sum);

	}

	private static void gugudan_for() {
		System.out.println("gugudan_for()");
		int sum = 0;
		for (int u = 1; u < 10; u++) {
			for (int j = 2; j < 10; j++) {
				sum = j * u;
				System.out.printf("%d * %d =%2d ", j, u, sum);
			}
			System.out.println("");
		}
	}

	private static void gugudan_while() {
		System.out.println("gugudan_for()");
		int u = 1;
		int sum = 0;
		while (u < 10) {
			int j = 2;
			while (j < 10) {
				sum = j * u;
				System.out.printf("%d * %d =%2d ", j, u, sum);
				j++;
			}
			u++;
			System.out.println("");
		}
	}
}
