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
		System.out.print("���� Ŀ�� �帱���? ");
		String order = sc.next();
		int price = 0;

//		switch (order) {
//		case "����������":
//		case "īǪġ��":
//		case "ī���":
//			price = 3500;
//			break;
//		case "�Ƹ޸�ī��":
//			price = 2000;
//			break;
//		default:
//			System.out.println("�޴��� �����ϴٸ�....");
//		}
//		if (price != 0)
//			System.out.print(order + "�� " + price + "���Դϴ�");
		
		if (order.equals("�Ƹ޸�ī��") || order.equals("īǪġ��") || order.equals("ī����") || order.equals("����������")) {
			if (order.equals("�Ƹ޸�ī��")) {
				price = 2000;
				System.out.print(order +"��" + price + "���Դϴ�.");
			}
			else {
				price = 3500;
				System.out.print(order +"��" + price + "���Դϴ�.");
			}
		}
		else {
			System.out.println("�޴��� ���µ���.....");
		}
		
	}

//	private static void gradeSwitch(Scanner sc) {
//		char grade;
//		System.out.print("������ �Է��ϼ���. (0~100): ");
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
//		System.out.println("������ " + grade + "�Դϴ�.");

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
//		System.out.println("������ " + grade + "�Դϴ�.");
//	}

}
