package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.>>");
		Scanner sc = new Scanner(System.in);
		
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean isSingle = sc.nextBoolean();
		System.out.printf("�̸�%s ���� %s ����%d ü��%.2f ���ſ���%b %n",
							name, city, age, weight, isSingle);
		sc.close();
//		System.out.println(sc.nextline());
	}
}
