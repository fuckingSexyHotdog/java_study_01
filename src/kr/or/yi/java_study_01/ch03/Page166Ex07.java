package kr.or.yi.java_study_01.ch03;

import java.util.Random;

public class Page166Ex07 {
	public static void main(String[] args) {
		int[] intArr = new int[10];
		Random rnd = new Random();
		tenRandom(intArr, rnd);
	}

	private static void tenRandom(int[] intArr, Random rnd) {
		String hap = "랜덤한 정수들 : ";
		int avg = 0;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(10) + 1;
			hap = hap + intArr[i] + " ";
			avg = avg + intArr[i];
		}
		System.out.println(hap);
		System.out.println("평균은 " + (double)avg / intArr.length);
	}
}
