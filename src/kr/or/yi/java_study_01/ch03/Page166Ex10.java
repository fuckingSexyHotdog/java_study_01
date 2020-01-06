package kr.or.yi.java_study_01.ch03;

import java.util.Random;

public class Page166Ex10 {
	public static void main(String[] args) {
		int[][] intArr = new int[4][4];
		Random rnd = new Random();
		inser(rnd, intArr);
	}

	private static void inser(Random rnd, int[][] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				intArr[i][j] = rnd.nextInt(10) + 1;
			}
		}
		for (int i = 0; i < 6; i++) {
			int x = rnd.nextInt(4);
			int y = rnd.nextInt(4);
			if (intArr[x][y] == 0) {
				i--;
			}
			intArr[x][y] = 0;
		}
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.printf("%2d ", intArr[i][j]);
			}
			System.out.println("");
		}
	}
}
