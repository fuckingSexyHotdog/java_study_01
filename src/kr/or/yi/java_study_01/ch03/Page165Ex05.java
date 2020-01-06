package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page165Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[10];
		x3prn(sc, intArr);
		sc.close();
	}

	private static void x3prn(Scanner sc, int[] intArr) {
		System.out.println("양의 정수 10개를 입력하세요.");
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		String intArrX3 = "3의 배수는 ";
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 3 == 0) {
				intArrX3 = intArrX3 + intArr[i] + " ";
			}
		}
		if (intArrX3.length() == 7) {
			intArrX3 = "3의 배수가 없네용~";
			System.out.println(intArrX3);
		} else {
			System.out.println(intArrX3);
		}
	}
}
