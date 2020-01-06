package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Ex_2019_12_06_Ex02 {
	public static void main(String[] args) {
		ex_2();
	}

	private static void ex_2() {
		// 입력된 정수의 자리를 바꾸어 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// 정수를 입력
		if (num<0) {
			System.out.println("오류오류");
		}
		else {
			String tex = "";// 입력한 정수의 길이를 구하기 위해 String 변수를 선언
			tex += num; // 입력한 정수를 String변수에 입력
			int i = 0;
			do {
				int j = (int) Math.pow(10, i);// 10의 제곱근을 구함
				System.out.print((num / j) % 10);// (입력한 정수값/10의 제곱근)%10을 출력
				i++;// i가 1증가
			} while (i < tex.length());// 입력한 정수의 길이만큼 반복
		}
		sc.close();
	}
}
