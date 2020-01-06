package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Exam20191125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		sc.close();
//		String a = "";
//		for (int i=0; i<5; i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("");
//			}
//		}
//		for(int j=0; j<5; j++) {
//			for(int i=0;i<5-j;i++) {
//				System.out.print("*");
//			}
//		System.out.println("");
//		}
		String b = "";
		for (int s = 0; s < 5; s++) {
			System.out.print(b);
			for (int f = 0; f < 5 - s; f++) {
				System.out.print("*");
			}
			System.out.println("");
			b = b + " ";// 2¹ø
		}
		String a = "*";
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("");
			}
			System.out.printf("%5s%n", a);
			a = a + "*";// 1¹ø
		}
	}
}
