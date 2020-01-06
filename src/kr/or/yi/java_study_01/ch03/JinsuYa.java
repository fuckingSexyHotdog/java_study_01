package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class JinsuYa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jinsu(sc);
		sc.close();
	}

	private static void Jinsu(Scanner sc) {
		int ya = sc.nextInt();
		String sum = "";
		int sum2 = 0;
		int sum3 = ya;
		for (int i = 0; i < sum3; i++) {
			sum = (ya % 2) + sum;
			sum2 = ya / 2;
			ya = sum2;
			if (ya == 1) {
				sum = (ya % 2) + sum;
				break;
			}
		}
		System.out.println(sum);
	}
}
