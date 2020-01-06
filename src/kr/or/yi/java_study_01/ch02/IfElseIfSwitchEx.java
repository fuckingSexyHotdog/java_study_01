package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class IfElseIfSwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		gradeSwitch(sc);
		coffeePrice(sc);
		sc.close();
	}

	private static void coffeePrice(Scanner sc) {
		System.out.print("무슨 커피 드릴까요? ");
		String order = sc.next();
		int price = 0;

//		switch (order) {
//		case "에스프레소":
//		case "카푸치노":
//		case "카페라떼":
//			price = 3500;
//			break;
//		case "아메리카노":
//			price = 2000;
//			break;
//		default:
//			System.out.println("메뉴에 없습니다만....");
//		}
//		if (price != 0)
//			System.out.print(order + "는 " + price + "원입니다");
		
		if (order.equals("아메리카노") || order.equals("카푸치노") || order.equals("카페라뗴") || order.equals("에스프레소")) {
			if (order.equals("아메리카노")) {
				price = 2000;
				System.out.print(order +"는" + price + "원입니다.");
			}
			else {
				price = 3500;
				System.out.print(order +"는" + price + "원입니다.");
			}
		}
		else {
			System.out.println("메뉴에 없는데요.....");
		}
		
	}

//	private static void gradeSwitch(Scanner sc) {
//		char grade;
//		System.out.print("점수를 입력하세요. (0~100): ");
//		int score = sc.nextInt();
//
//		switch (score / 10) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//		}
//		System.out.println("학점은 " + grade + "입니다.");

//		if (score >= 90) {
//			grade = 'A';
//		} 
//		else if (score >= 80) {
//			grade = 'B';
//		} 
//		else if (score >= 70) {
//			grade = 'C';
//		} 
//		else if (score >= 60) {
//			grade = 'D';
//		} 
//		else {
//			grade = 'F';
//		}
//		System.out.println("학점은 " + grade + "입니다.");
//	}

}
