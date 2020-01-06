package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Factory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
		sc.close();
//		factorial(i);
//		factorial2(i);
//		factorial3(i);
//		reversefactorial(i);
//		pibo(i);
		for (int j=0;j<10;j++) {
			System.out.print(j);
		}
		
		
		

	}

	private static void pibo(int i) {
		String sum = "";
		int x0=0;
		int x1=1;
		if (i==0) {
			System.out.print("0");
		}
		else {
			System.out.print("0 + 1");
			for (int j = 1;j<i;j++) {
				int x2=0;
				x2=x1+x0;
				x0=x1;
				x1=x2;
				System.out.print(" + " + x2);
			}
			System.out.println("");
		}
	}

	private static void reversefactorial(int i) {
		int sum = 1;
		System.out.printf("%d! =", i);
		for (int j = 1; ((i + 2) - j) > 1; j++) {
			sum = (sum * ((i + 1) - j));
			System.out.printf(" %d %s", ((i + 1) - j), j == i ? "=" : "*");
		}
		System.out.println(" " + sum);
	}

	private static void factorial3(int i) {
		int sum = 1;
		System.out.printf("%d! =", i);
		for (int j = 1; j < i + 1; j++) {
			sum = sum * j;
			System.out.printf(" %d %s", j, j == i ? "=" : "*");
		}
		System.out.println(" " + sum);
	}

	private static void factorial2(int i) {
		int sum = 1;
		System.out.print(i + "! = ");
		for (int j = 1; j < i + 1; j++) {
			sum = sum * j;
			System.out.print(j + " * ");
		}
		System.out.println("= " + sum);
	}

	private static void factorial(int i) {
		System.out.print("입력한 수까지의 수의 곱을 보여드립니다.");
		int sum = 1;
		for (int j = 1; j < i + 1; j++) {
			sum = sum * j;
		}
		System.out.println(sum);
	}
}
