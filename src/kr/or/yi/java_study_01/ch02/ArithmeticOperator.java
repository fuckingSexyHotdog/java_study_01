package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		getHourMinuteSecond(sc);
		getPayCount(sc);
		sc.close();

		postfix();
		prefix();

	}

	private static void prefix() {
		int a = 10;
		int b = ++a;// 후위 증감
		System.out.printf("a = %d b = %d %n", a, b);
	}

	private static void postfix() {
		int a = 10;
		int b = a++;// 전위 증감
		System.out.printf("a = %d, b = %d %n", a, b);
	}

	private static void getPayCount(Scanner sc) {
		System.out.println("금액을 입력하세요");
		int pay = sc.nextInt();// 9,7870원
		int 오만원 = pay / 50000;
		int 만원 = (pay % 50000) / 10000;
		int 오천원 = ((pay % 50000) % 10000) / 5000;
		int 천원 = (((pay % 50000) % 10000) % 5000) / 1000;
		int 오백원 = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int 백원 = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int 오십원 = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int 십원 = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

		System.out.print("오만원" + 오만원 + "장, ");
		System.out.print("만원" + 만원 + "장, ");
		System.out.print("오천원" + 오천원 + "장, ");
		System.out.print("천원" + 천원 + "장, ");
		System.out.print("오백원" + 오백원 + "개, ");
		System.out.print("백원" + 백원 + "개, ");
		System.out.print("오십원" + 오십원 + "개, ");
		System.out.println("십원" + 십원 + "개");
		System.out.printf("오만원%d장 만원%d장 오천원%d장 천원%d장 오백원%d개 백원%d개 오십원%d개 십원%d개 %n", 오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원);
	}

//	private static void getHourMinuteSecond(Scanner sc) {
//		System.out.println("시간을 입력하세요");
//		int time = sc.nextInt();
//		int second = time % 60;
//		int minute = (time / 60) % 60;
//		int hour = ((time /60) / 60) / 60;
//		
//		System.out.print(time + "초는");
//		System.out.print(hour + "시간, ");
//		System.out.print(mitnue + "분, ");
//		System.out.print(second + "초입니다.");
//	}

}
