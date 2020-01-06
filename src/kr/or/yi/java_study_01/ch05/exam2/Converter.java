package kr.or.yi.java_study_01.ch05.exam2;

import java.util.Scanner;

abstract class Converter {
	protected double ratio;// 비율

	abstract protected double convert(double src);// 추상 메소드

	abstract protected String getSrcString();// 추상 메소드

	abstract protected String getDesttring();// 추상 메소드

	public void run(Scanner sc) {
		System.out.println(getSrcString() + "을 " + getDesttring() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요. >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDesttring() + "입니다.");
	}
}
