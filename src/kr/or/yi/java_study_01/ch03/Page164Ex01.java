package kr.or.yi.java_study_01.ch03;

public class Page164Ex01 {
	public static void main(String[] args) {
		whileTest();
		forTest();
		doWhileTest();
	}

	private static void doWhileTest() {
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i += 2;
		} while (i < 100);
		System.out.println(sum);

	}

	private static void forTest() {
		int sum = 0;
		for (int i = 0; i < 100; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void whileTest() {
		int sum = 0;
		int i = 0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}
