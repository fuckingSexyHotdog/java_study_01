package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class Page170Ex16 {
	public static void main(String[] args) {
		String[] str = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위바위보 게임을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		twoZeroFive(sc, rnd, str);
		sc.close();
	}

	private static void twoZeroFive(Scanner sc, Random rnd, String[] str) {
		while (true) {
			int i = rnd.nextInt(3);
			System.out.print("가위, 바위, 보~~~~!!!>>");
			String user = sc.next();
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다......");
				break;
			}
			System.out.println("사용자 = " + user + ",  컴퓨터 = " + str[i]);
			if (user.equals("가위")) {
				if (str[i].equals("바위")) {
					System.out.println("사용자가 졌습니다.");
				}
				if (str[i].equals("가위")) {
					System.out.println("비겼습니다.");
				}
				if (str[i].equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				}
			} else if (user.equals("바위")) {
				if (str[i].equals("바위")) {
					System.out.println("비겼습니다.");
				}
				if (str[i].equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				if (str[i].equals("보")) {
					System.out.println("사용자가 졌습니다.");
				}
			} else if (user.equals("보")) {
				if (str[i].equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				if (str[i].equals("가위")) {
					System.out.println("사용자가 졌습니다.");
				}
				if (str[i].equals("보")) {
					System.out.println("비겼습니다.");
				}
			} else {
				System.out.println("잘못입력하셨습니다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			sc.nextLine();
		}
	}
}
