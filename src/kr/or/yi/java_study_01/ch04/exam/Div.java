package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

public class Div {
	int a;
	int b;

	public Div(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Div() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int calculate(Scanner sc) {
		System.out.println("두 정수와 연산자를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String d = sc.next();
		int c = a / b;
		return c;
	}
}
