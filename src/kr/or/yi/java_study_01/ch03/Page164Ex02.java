package kr.or.yi.java_study_01.ch03;

public class Page164Ex02 {
	public static void main(String[] args) {
		int[][] n = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		prn(n);
	}

	private static void prn(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("%d ", n[i][j]);
			}
			System.out.println("");
		}

	}
}
