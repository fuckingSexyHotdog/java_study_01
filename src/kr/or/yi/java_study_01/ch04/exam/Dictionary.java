package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

class Dictionary {

	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2eng(String word) {
		Scanner sc = new Scanner(System.in);
		word = "";
		while (true) {
			System.out.println("한영 단어 검색 프로그램입니다.");
			System.out.print("한글 단어?");
			word = sc.next();
			if (word.equals("그만")) {
				break;
			}
			int cnt = 0;
			for (int i = 0; i < kor.length; i++) {
				if (word.equals(kor[i])) {
					System.out.println(kor[i] + " 는 " + eng[i]);
					cnt--;
					break;
				}
				cnt++;
				if (cnt == 5) {
					System.out.println(word + "는 저의 사전에 없습니다.");
					break;
				}
			}
		}
		sc.close();
		return word;
	}
}
