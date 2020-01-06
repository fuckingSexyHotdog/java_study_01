package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Exam110Page1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		dollars(sc);
//		tenOneSame(sc);
//		koreaMoney(sc);
//		threeSu(sc);
//		triangle(sc);
//		threeSixNineClap(sc);
//		square(sc);
		twoSquare(sc);
//		circleArea(sc);
//		twoCircleArea(sc);
//		month(sc);
//		four(sc);

		sc.close();
	}

	private static void four(Scanner sc) {
		System.out.println("연산 >>");
		double x = sc.nextDouble();
		String four = sc.next();
		double y = sc.nextDouble();
		if (four.equals("+")) {
			System.out.println(x + four + y + "의 계산 결과는 " + (x + y));
		} else if (four.equals("-")) {
			System.out.println(x + four + y + "의 계산 결과는 " + (x - y));
		} else if (four.equals("*")) {
			System.out.println(x + four + y + "의 계산 결과는 " + (x * y));
		} else if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else if (four.equals("/")) {
			System.out.println(x + four + y + "의 계산 결과는 " + (x / y));
		} else {
			System.out.println("사칙연산만 써주세요");
		}
		switch (four) {
		case "+": {
			System.out.println(x + four + y + "의 계산 결과는 " + (x + y));
			break;
		}
		case "-": {
			System.out.println(x + four + y + "의 계산 결과는 " + (x - y));
			break;
		}
		case "*": {
			System.out.println(x + four + y + "의 계산 결과는 " + (x * y));
			break;
		}
		case "/": {
			if (y == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(x + four + y + "의 계산 결과는 " + (x / y));
			}
			break;
		}
		default: {
			System.out.println("사칙연산만 써주세요");
			break;
		}

		}
	}

	private static void month(Scanner sc) {
		System.out.println("달을 입력하세요 (1~12) >>");
		int month = sc.nextInt();
		if ((month == 3) || (month == 4) || (month == 5)) {
			System.out.println("봄");
		} else if ((month == 6) || (month == 7) || (month == 8)) {
			System.out.println("여름");
		} else if ((month == 9) || (month == 10) || (month == 11)) {
			System.out.println("가을");
		} else if ((month == 12) || (month == 1) || (month == 2)) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}
		switch (month) {
		case 1: {
			System.out.println("겨울");
			break;
		}
		case 2: {
			System.out.println("겨울");
			break;
		}
		case 3: {
			System.out.println("봄");
			break;
		}
		case 4: {
			System.out.println("봄");
			break;
		}
		case 5: {
			System.out.println("봄");
			break;
		}
		case 6: {
			System.out.println("여름");
			break;
		}
		case 7: {
			System.out.println("여름");
			break;
		}
		case 8: {
			System.out.println("여름");
			break;
		}
		case 9: {
			System.out.println("가을");
			break;
		}
		case 10: {
			System.out.println("가을");
			break;
		}
		case 11: {
			System.out.println("가울");
			break;
		}
		case 12: {
			System.out.println("겨울");
			break;
		}
		default: {
			System.out.println("잘못입력");
			break;
		}
		}
	}

	private static void twoCircleArea(Scanner sc) {
		System.out.println("첫번째 원의 중심과 반지름 입력");
		double cX = sc.nextDouble();
		double cY = sc.nextDouble();
		double radius = sc.nextDouble();
		System.out.println("두번째 원의 중심과 반지름 입력");
		double cX2 = sc.nextDouble();
		double cY2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
		double temp = Math.sqrt(Math.pow((cX - cX2), 2) + Math.pow((cY - cY2), 2));

		if (temp < (radius + radius2)) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
	}

	private static void circleArea(Scanner sc) {
		System.out.println("원의 중심과 반지름 입력");
		double cX = sc.nextDouble();
		double cY = sc.nextDouble();
		double radius = sc.nextDouble();
		System.out.println("점 입력");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double temp = Math.sqrt(Math.pow((cX - x), 2) + Math.pow((cY - y), 2));

		if (temp < radius) {
			System.out.println("점(" + x + "," + y + ")는 원안에 있다.");
		} else {
			System.out.println("점(" + x + "," + y + ")는 원안에 없다.");
		}

	}

	private static void twoSquare(Scanner sc) {
		System.out.println("(x1, y1), (x2, y2)의 좌표를 입력하세요.");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int rectx1 = 100;
		int rectx2 = 200;
		int recty1 = 100;
		int recty2 = 200;

		if ((x1 < 100) && (x2 < 100) || (x1 > 200) && (x2 > 200)) {
			System.out.println("사각형과 충돌하지 않습니다.");
		} else if ((y1 < 100) && (y2 < 100) || (y1 > 200) && (y2 > 200)) {
			System.out.println("사각형과 충돌하지 않습니다.");
		}
//		else if (((x1 > 200) && (x2 < 100)) && ((y1 > 200) && (y2 < 100)) || ((x1 < 100) && (x2 > 200)) && ((y1 < 100) && (y2 > 200))) {
//			System.out.println("사각형과 충돌하지 않습니다.");
//		}// 다른 사각형을 포함한 사각형
//		else if (((x1 > 100) && (x1 < 200)) && ((y1 > 100) && (y1 < 200)) && ((x2 > 100) && (x2 < 200)) && ((y2 > 100) && (y2 < 200))) {
//			System.out.println("사각형과 충돌하지 않습니다.");
//		}// 다른 사각형 안에 생긴 사각형
		else {
			System.out.println("사각형과 충돌하고 있습니다.");
		}
	}

	private static void square(Scanner sc) {
		System.out.println("점 (x, y)의 좌표를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (((x >= 100) && (x <= 200)) && ((y >= 100) && (y <= 200))) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		} else {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
		}

	}

	private static void threeSixNineClap(Scanner sc) {
		System.out.println("1~99 사이의 정수를 입력하시오 >>");
		int c = sc.nextInt();
		int a = (c / 10);
		int b = (c % 10) % 10;
		if (((a == 3) || (a == 6) || (a == 9)) && ((b == 3) || (b == 6) || (b == 9))) {
			System.out.println("박수짝짝");
		} else if (((a == 3) || (a == 6) || (a == 9)) || ((b == 3) || (b == 6) || (b == 9))) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		}

	}

	private static void triangle(Scanner sc) {
		System.out.println("정수 3개를 입력하시오 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 되지 않습니다.");
		}
	}

	private static void threeSu(Scanner sc) {
		System.out.println("정수 3개 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a > b) && (a > c) || (a == b) || (a == c)) {
			if (b >= c) {
				System.out.println("중간값은" + b + "입니다");
			} else {
				System.out.println("중간값은" + c + "입니다");
			}
		} else if ((b > a) && (b > c) || (b == c)) {
			if (a >= c) {
				System.out.println("중간값은" + a + "입니다");
			} else {
				System.out.println("중간값은" + c + "입니다");
			}
		} else if ((c > a) && (c > b)) {
			if (a >= b) {
				System.out.println("중간값은" + a + "입니다");
			} else {
				System.out.println("중간값은" + b + "입니다");
			}
		} else {
			System.out.println("몰라");
		}
	}

	private static void koreaMoney(Scanner sc) {
		System.out.println("금액을 입력하시오 >>>");
		int pay = sc.nextInt();
		int 오만원 = pay / 50000;
		int 만원 = (pay % 50000) / 10000;
		int 오천원 = ((pay % 50000) % 10000) / 5000;
		int 천원 = (((pay % 50000) % 10000) % 5000) / 1000;
		int 오백원 = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int 백원 = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int 오십원 = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int 십원 = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		int 일원 = ((((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10) / 10;
		System.out.printf("오만원%d장%n만원%d장%n오천원%d장%n천원%d장%n오백원%d개%n백원%d개%n오십원%d개%n십원%d개 %n일원%d개 %n", 오만원, 만원, 오천원, 천원,
				오백원, 백원, 오십원, 십원, 일원);
		System.out.println("오만원" + 오만원 + "매 ");
		System.out.println("만원" + 만원 + "매 ");
		System.out.println("오천원" + 오천원 + "매 ");
		System.out.println("천원" + 천원 + "매 ");
		System.out.println("오백원" + 오백원 + "개 ");
		System.out.println("백원" + 백원 + "개 ");
		System.out.println("오십원" + 오십원 + "개 ");
		System.out.println("십원" + 십원 + "개");
		System.out.println("일원" + 일원 + "개");
	}

	private static void tenOneSame(Scanner sc) {
		System.out.println("2자리수의 정수 입력 (10 ~ 99) >> ");
		int tenOne = sc.nextInt();
		int ten = tenOne / 10;
		int one = tenOne % 10;
		if (ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 같지않습니다.");
		}
	}

	private static void dollars(Scanner sc) {
		System.out.println("원화를 입력하세요. (단위 : 원) >>> ");
		int 원화 = sc.nextInt();
		double 달러 = (((원화 * 10) / 1100) * 0.1);
		System.out.println(원화 + "원은" + " 대략$" + 달러 + "입니다.");
	}
}
