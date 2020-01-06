package kr.or.yi.java_study_01.ch03;

import java.util.Random;

public class Page166Ex09 {
	public static void main(String[] args) {
		int[][] intArr = new int[4][4];
		Random rnd = new Random();
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				intArr[i][j] = rnd.nextInt(10) + 1;
				System.out.printf("%2d ", intArr[i][j]);
			}
			System.out.println("");
		}
	}
}
