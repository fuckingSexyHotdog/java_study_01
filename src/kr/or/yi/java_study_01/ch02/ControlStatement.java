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
		 *점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
		 *4학년의 경우 70점 이상이어야 합격
		 *1. 점수와 학년을 입력받기
		 *2. 점수가 60점 이상이면 합격
		 *3. 점수가 60점 미만이면 불합격
		 *4. 합격자 중에서 4학년의 경우 70점 이상이면 합격
		 */		
		
		System.out.printf("점수를 입력(0~100)\n학년을 입력하세요(1~4) 예) 90 3 >>");
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
		
//		System.out.println(jumsu + " : " + year);
		
		if (jumsu >= 60) {
			if (year == 4) {
				if (jumsu >= 70) {
					System.out.println("합격");
				}
				else {
					System.out.println("불합격");
				}
			}
			else {
				System.out.println("합격");
			}
			
			if(year != 4) {
				System.out.println("합격!");
			}
			else if(jumsu >= 70) {
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
		}
		else {
			System.out.println("불합격");
		}
		
	}

//	private static void NestedIf(Scanner sc) {
//		System.out.println("점수를 입력하세요. (0~100): ");
//		int score = sc.nextInt();
//		System.out.println("학년을 입력하세요. (1~4): ");
//		int year = sc.nextInt();
//		
//		if(score >= 60) {
//			if(year != 4) {
//				System.out.println("합격!");
//			}
//			else if(score >= 70) {
//				System.out.println("합격!");
//			}
//			else {
//				System.out.println("불합격!");
//			}
//		}
//		else {
//			System.out.println("불합격!");
//		}
//	}


//      private static void Grading() {
//		
//		
//		
//		System.out.println("점수를 입력하세요(0~100): ");
//		
//		int score = sc.nextInt();
//		char grade;
//		
//		if(score >= 90) {
//			grade = "수";
//		}
//		else if(score >= 80) {
//			grade = "우";
//		}
//		else if(score >= 70) {
//			grade = "미";
//		}
//		else if(score >= 60) {
//			grade = "양";
//		}
//		else {
//			grade = "가";
//		}
//		
//	}

//	private static void TernaryTree() {
//		System.out.println("수를 입력하시오 : ");
//		int number = sc.nextInt();
//		String res = 
//	}

//	private static void multipletree(Scanner sc) {
//		System.out.print("수를 입력하시오 : ");
//		int number = sc.nextInt();
//		
//		if (number % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}
//		else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
//	}
}
