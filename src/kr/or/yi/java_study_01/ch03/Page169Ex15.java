package kr.or.yi.java_study_01.ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Page169Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력 >>");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니데이");
				sc.nextLine();// 어떤 의미인지 알아야겠다.
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
