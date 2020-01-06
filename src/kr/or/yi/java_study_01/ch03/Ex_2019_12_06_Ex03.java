package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class Ex_2019_12_06_Ex03 {
	public static void main(String[] args) {
		ex_3();
	}

	private static void ex_3() {
		// 정답을 맞추는 게임을 설계하시오. (범위는 1~100)
		// 정수를 입력하면 정답보다 낮은지 높은지만 말해주고 맞출때까지 반복.
		// 음수 입력시 반복중단
		System.out.println("게임을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int dab = rnd.nextInt(100) + 1;
		while (true) {
			System.out.println("1~100까지 입력하세요.");
			int num = sc.nextInt();
			if (num <= 0) {
				break;
			}
			if (dab == num) {
				System.out.println("정답입니다.");
				break;
			} else if (dab > num) {
				System.out.println("입력하신 수가 정답보다 낮습니다.");
			} else if (dab < num) {
				System.out.println("입력하신 수가 정답보다 높습니다.");
			} else {
				System.out.println("범위를 벗어났습니다.");
			}
		}
		System.out.println("게임 종료");
		sc.close();
	}
}
