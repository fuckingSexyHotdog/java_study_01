package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		exam3_while(sc);
//		exam3_for(sc);
//		gugudan(sc);
//		gugudan_full();
//		gugudan_full_land();
//		factorial(sc);
//		fibonacci(sc);
		sc.close();

	}

	private static void fibonacci(Scanner sc) {
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

	private static void factorial(Scanner sc) {
		int i = sc.nextInt();
		int sum = 1;
		int j = 1;
		System.out.print(i + "!= ");
		while (j < i + 1) {
			sum = sum * j;
			System.out.print(j + (j != i ? " * " : " = "));
			j++;
		}
		System.out.println(sum);
	}

	private static void gugudan_full_land() {
		int i = 1;
		int sum = 0;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				sum = j * i;
				System.out.printf("%d * %d =%2d ", j, i, sum);
				j++;
			}
			i++;
			System.out.println("");
		}

	}

	private static void gugudan_full() {
		int i = 2;
		int sum = 0;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				sum = i * j;
				System.out.println(i + "*" + j + "=" + sum);
				j++;
			}
			i++;
		}

	}

	private static void gugudan(Scanner sc) {
		int i = sc.nextInt();
		int j = 1;
		int sum = 0;
		while (j < 10) {
			sum = i * j;
			System.out.println(i + "*" + j + "=" + sum);
			j++;
		}

	}

	private static void exam3_for(Scanner sc) {
		int i = sc.nextInt();
		int sum = 0;
		int count;
		for (count = 0; i != -1; count++) {
			sum = sum + i;
			i = sc.nextInt();
		}
		System.out.println(((double) (sum / count)));
	}

	private static void exam3_while(Scanner sc) {
		int i = sc.nextInt();
		int sum = 0;
		int count = 0;
		while (i != -1) {
			sum = sum + i;
			count++;
			i = sc.nextInt();
		}
		System.out.println(((double) (sum / count)));
	}

}
