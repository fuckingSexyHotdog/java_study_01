package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

import kr.or.yi.java_study_01.ch04.Circle;

public class ExamMain {

	public static void main(String[] args) {
		/*
		 * 1. 학생정보를 관리하는 프로그램을 작성하세요. 2. 학생클래스를 정의(번호, 성명, 국어, 영어, 수학) 3. 10개의 학생정보를 담을
		 * 수있는 배열 4. 메뉴작성(1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 종료)
		 */
//		test();
		Student[] stdArr = new Student[15];
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색  6. 종료");
			res = sc.nextInt();
			System.out.println(res);
			switch (res) {
			case 1:
				prnStudentInfo(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, sc);
				break;
			case 4:
				delStudent(stdArr, sc);
				break;
			case 5:
				searchStudent(stdArr, sc);
				break;
			}
		} while (res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();

	}

	private static void searchStudent(Student[] stdArr, Scanner sc) {
		System.out.println("검색할 학생번호를 입력하세요.");
		int selStdNo = sc.nextInt()-1;
		for(int i=0; i<stdArr.length;i++) {
			if(i==selStdNo) {
				System.out.println(stdArr[i]);
				break;
			}
		}
	}

	private static void delStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 삭제 구현하기");
		System.out.println("삭제할 학생번호를 입력해주세요");
		int d = sc.nextInt() - 1;
		stdArr[d] = null;
		for (int i = d; i < stdArr.length - 1; i++) {
			try {
				stdArr[i] = stdArr[i + 1];
				stdArr[i].setStdNo(i + 1);
			} catch (NullPointerException e) {
				System.out.println("null ");
			}
		}
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 수정 구현하기");
		System.out.println("학생중 수정할 학생번호를 입력해주세요..");
		int stdno = sc.nextInt() - 1;
		int sel;
		int num;
		do {
			System.out.println("학생 정보 중 수정할 목록을 선택해주세요.");
			System.out.println("1.학생번호 2.학생이름 3.국어점수 4.영어점수 5.수학점수 6.종료");
			sel = sc.nextInt();
			switch (sel) {
			case 1:
				System.out.println("학생번호를 수정하겠습니다.");
				num = sc.nextInt();
				stdArr[stdno].setStdNo(num);
				stdArr[num - 1].setStdNo(stdno + 1);
				break;
			case 2:
				System.out.println("학생이름을 수정하겠습니다.");
				String stdname = sc.next();
				stdArr[stdno].setStdName(stdname);
				break;
			case 3:
				System.out.println("국어점수를 수정하겠습니다.");
				num = sc.nextInt();
				stdArr[stdno].setKor(num);
				break;
			case 4:
				System.out.println("영어점수를 수정하겠습니다.");
				num = sc.nextInt();
				stdArr[stdno].setEng(num);
				break;
			case 5:
				System.out.println("수학점수를 수정하겠습니다.");
				num = sc.nextInt();
				stdArr[stdno].setMath(num);
				break;
			}
		} while (sel < 6);

	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 추가 구현하기");
		for (int i = 0; i < stdArr.length; i++) {
			if (stdArr[i] == null) {
				int stdno = i + 1;
				System.out.println("학생이름을 입력해주세요.");
				String stdname = sc.next();
				System.out.println("국어 점수를 입력해주세요.");
				int stdkor = sc.nextInt();
				System.out.println("영어 점수를 입력해주세요.");
				int stdeng = sc.nextInt();
				System.out.println("수학 점수를 입력해주세요.");
				int stdmath = sc.nextInt();
				stdArr[i] = new Student(stdno, stdname, stdkor, stdeng, stdmath);
				break;
			}
		}
	}

	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("학생 목록 구현하기");
		int cnt = 0;
		for (Student s : stdArr) {
			if (s == null) {
				cnt++;
			}
		}
		for (int j = 0; j < stdArr.length - (cnt + 1); j++) {
			for (int i = 0; i < stdArr.length - (cnt + 1 + j); i++) {
				if (stdArr[i].getStdNo() > stdArr[i + 1].getStdNo()) {
					Student[] temp = new Student[1];
					temp[0] = stdArr[i + 1];
					stdArr[i + 1] = stdArr[i];
					stdArr[i] = temp[0];
				}
			}
		}
		for (Student s : stdArr) {
			System.out.println(s);
		}
	}
}
