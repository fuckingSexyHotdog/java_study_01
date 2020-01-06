package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page167Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };
		int y = 0;
		for (int i = 0; i >= 0; i++) {
			System.out.print("과목이름 >>");
			String subject = sc.next();
			for (int j = 0; j < course.length; j++) {
				if (course[j].equals(subject)) {
					System.out.println(course[j] + "의 점수는 " + score[j]);
					y = j;
					break;
				} else if (j == score.length - 1) {
					System.out.println("없는 과목입니다!!!!!");
				}
			}
			if (subject.equals("그만")) {
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
