package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
//		multipletree(sc);
//		TernaryTree(sc);
//		Grading(sc);
//		NestedIf(sc);
		NestedIfTeacher(sc);
		sc.close();
		
		
		
		
	}

	private static void NestedIfTeacher(Scanner sc) {
		/*
		 *������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ�
		 *4�г��� ��� 70�� �̻��̾�� �հ�
		 *1. ������ �г��� �Է¹ޱ�
		 *2. ������ 60�� �̻��̸� �հ�
		 *3. ������ 60�� �̸��̸� ���հ�
		 *4. �հ��� �߿��� 4�г��� ��� 70�� �̻��̸� �հ�
		 */		
		
		System.out.printf("������ �Է�(0~100)\n�г��� �Է��ϼ���(1~4) ��) 90 3 >>");
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
		
//		System.out.println(jumsu + " : " + year);
		
		if (jumsu >= 60) {
			if (year == 4) {
				if (jumsu >= 70) {
					System.out.println("�հ�");
				}
				else {
					System.out.println("���հ�");
				}
			}
			else {
				System.out.println("�հ�");
			}
			
			if(year != 4) {
				System.out.println("�հ�!");
			}
			else if(jumsu >= 70) {
				System.out.println("�հ�!");
			}
			else {
				System.out.println("���հ�!");
			}
		}
		else {
			System.out.println("���հ�");
		}
		
	}

//	private static void NestedIf(Scanner sc) {
//		System.out.println("������ �Է��ϼ���. (0~100): ");
//		int score = sc.nextInt();
//		System.out.println("�г��� �Է��ϼ���. (1~4): ");
//		int year = sc.nextInt();
//		
//		if(score >= 60) {
//			if(year != 4) {
//				System.out.println("�հ�!");
//			}
//			else if(score >= 70) {
//				System.out.println("�հ�!");
//			}
//			else {
//				System.out.println("���հ�!");
//			}
//		}
//		else {
//			System.out.println("���հ�!");
//		}
//	}


//      private static void Grading() {
//		
//		
//		
//		System.out.println("������ �Է��ϼ���(0~100): ");
//		
//		int score = sc.nextInt();
//		char grade;
//		
//		if(score >= 90) {
//			grade = "��";
//		}
//		else if(score >= 80) {
//			grade = "��";
//		}
//		else if(score >= 70) {
//			grade = "��";
//		}
//		else if(score >= 60) {
//			grade = "��";
//		}
//		else {
//			grade = "��";
//		}
//		
//	}

//	private static void TernaryTree() {
//		System.out.println("���� �Է��Ͻÿ� : ");
//		int number = sc.nextInt();
//		String res = 
//	}

//	private static void multipletree(Scanner sc) {
//		System.out.print("���� �Է��Ͻÿ� : ");
//		int number = sc.nextInt();
//		
//		if (number % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		}
//		else {
//			System.out.println("3�� ����� �ƴմϴ�.");
//		}
//	}
}
