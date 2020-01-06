package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

public class MonthSchedule {
	private int day;
	private String schedule;

	public MonthSchedule(int day) {
		this.day = day;

	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	private void view(Day[] monthDay, Scanner sc) {
		System.out.print("날짜 (1~" + day + ")?");
		int inNum = sc.nextInt();
		for (int i = 0; i < monthDay.length; i++) {
			if ((inNum - 1) == i) {
				System.out.print(inNum + "일의 할 일은 ");
				monthDay[i].show();
			}
		}

	}

	private void input(Day[] monthDay, Scanner sc) {
		System.out.print("날짜 (1~" + day + ")?");
		int inNum = sc.nextInt();
		monthDay[inNum - 1] = new Day();
		System.out.print("할일(빈 칸 없이 입력)?");
		String inText = sc.next();
		monthDay[inNum - 1].setWork(inText);
	}

	void run(Scanner sc) {
		Day[] monthDay = new Day[day];
		System.out.println("이번달 스케쥴 관리 프로그램");
		int choiceNum;
		do {
			System.out.print("할 일 (입력 :1, 보기 :2, 끝내기 :3)");
			choiceNum = sc.nextInt();
			switch (choiceNum) {
			case 1: {
				input(monthDay, sc);
				break;
			}
			case 2: {
				view(monthDay, sc);
				break;
			}
			case 3: {
				finish();
				break;
			}
			}
			sc.nextLine();
		} while (choiceNum < 3);
	}
}
