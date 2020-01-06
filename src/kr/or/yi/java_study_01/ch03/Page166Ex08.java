package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class Page166Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intArrRndNum(sc);
		sc.close();
	}

	private static void intArrRndNum(Scanner sc) {
		System.out.print("정수 몇개?? (100개미만)");
		int input = sc.nextInt();
		int[] intArr;
		if (input < 100 || input > 0) {
			intArr = new int[input];
			Random rnd = new Random();
			for (int i = 0; i < intArr.length; i++) {
				intArr[i] = rnd.nextInt(100) + 1;
				for (int j = 0; j < i; j++) {
					if (intArr[i] == intArr[j]) {
						i--;
					}
				}
			}
			for (int i = 0; i < intArr.length; i++) {
				System.out.printf("%3d ", intArr[i]);
				if ((i + 1) % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}
}
