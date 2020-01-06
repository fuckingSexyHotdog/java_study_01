package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Page167Ex14_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };
		
		String subj;
		int findIdx;
		while(true) {
			subj = sc.next();
			if(subj.equals("그만")) {
				break;
			}
			findIdx = find(subj, course);
			if(findIdx==-1) {
				System.out.println("없는 과목");
				continue;
			}
			System.out.printf("%s 과목의 점수는 %d%n", subj, score[findIdx]);
		}
		sc.close();
	}

	private static int find(String subj, String[] course) {
		for(int i=0;i<course.length;i++) {
			if(subj.equals(course[i])) {
				return i;
			}
		}
		return -1;
	}
}
