package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Exam106Page {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gaWiBawiBo(sc);
		sc.close();
	}

	private static void gaWiBawiBo(Scanner sc) {
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.println("철수 >>>");
		System.out.println("영희 >>>");
		String 철수 = sc.next();
		String 영희 = sc.next();
		if (((철수.equals("바위")) && (영희.equals("바위"))) || ((철수.equals("가위")) && (영희.equals("가위")))
				|| ((철수.equals("보")) && (영희.equals("보")))) {
			System.out.printf("비겼습니다.");
		} else if (((철수.equals("바위")) && (영희.equals("가위"))) || ((철수.equals("가위")) && (영희.equals("보")))
				|| ((철수.equals("보")) && (영희.equals("바위")))) {
			System.out.printf("철수가 이겼습니다.");
		} else if (((철수.equals("바위")) && (영희.equals("보"))) || ((철수.equals("가위")) && (영희.equals("바위")))
				|| ((철수.equals("보")) && (영희.equals("가위")))) {
			System.out.printf("영희가 이겼습니다.");
		} else {
			System.out.printf("위의 조건문을 보고 다시 입력해주세요.");
		}
	}

}
