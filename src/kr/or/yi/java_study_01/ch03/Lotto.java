package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random rnd = new Random(1243);
		int[] lottoArr = new int[6];
		lottoNum(rnd, lottoArr);
		System.out.println(Arrays.toString(lottoArr));
		dangcheom(lottoArr);
	}

	private static void dangcheom(int[] lottoArr) {
		int[][] dang = { { 19, 23, 25, 39, 44, 45 }, { 19, 23, 25, 39, 44, 40 }, { 19, 23, 25, 39, 40, 45 },
				{ 19, 23, 25, 31, 40, 45 }, { 19, 21, 22, 31, 44, 45 } };
		int[] rank = new int[5];
		for (int i = 0; i < dang.length; i++) {
			int cnt = 0;
			for (int j = 0; j < dang[i].length; j++) {
				if (lottoArr[j] == dang[i][j]) {
					cnt++;
				}
				rank[i] = cnt;
			}

		}
		for (int i = 0; i < dang.length; i++) {
			for (int j = 0; j < dang[i].length; j++) {
				System.out.print(dang[i][j] + " ");
			}
			switch (rank[i]) {
			case 6: {
				System.out.print("1등  ");
				break;
			}
			case 5: {
				if (dang[i][5] == lottoArr[5]) {
					System.out.print("2등  ");
				} else {
					System.out.print("3등  ");
				}
				break;
			}
			case 4: {
				System.out.print("4등  ");
				break;
			}
			case 3: {
				System.out.print("5등  ");
				break;
			}
			default: {
				System.out.print("다음 기회에...");
				break;
			}
			}
			System.out.println(rank[i] + "개");
		}
	}

	private static void lottoNum(Random rnd, int[] lottoArr) {
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = rnd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] == lottoArr[j]) {
					i--;
				}
			}
		}
		for (int j = 0; j < lottoArr.length - 1; j++) {
			for (int i = 0; i < lottoArr.length - 1; i++) {
				int temp = 0;
				if (lottoArr[i] > lottoArr[i + 1]) {
					temp = lottoArr[i + 1];
					lottoArr[i + 1] = lottoArr[i];
					lottoArr[i] = temp;
				}
			}
		}
	}
}
