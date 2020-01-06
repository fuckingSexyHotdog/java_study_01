package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("�� ������ �Է��Ͻÿ�. �������� �и�>>");
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();// �޼ҵ� ���� a�� int(������������)
		int b = sc.nextInt();// �޼ҵ� ���� b�� int(������������)
							 // �׷��� double, float(�Ǽ���������)�� �׳� �� �� ���� ���� ����ȯ�� ����� �Ѵ�.
		
		// a =5, b = 2
		// 7(5 + 2)
		// 3(5 - 2)
		// 10(5 * 2)
		// 2.5(5 / 2)
		
		int res = sum(a, b);// �� ���� ��
		System.out.printf("�� ��(%d, %d) �� ���� %d%n", a, b, res);
		
		res = sub(a, b); // �� ���� �� 
		System.out.printf("�� ��(%d, %d) �� ���� %d%n", a, b, res);
		  
    	res = mul(a, b); // �� ���� �� 
		System.out.printf("�� ��(%d, %d) �� ���� %d%n", a, b, res);
		  
	    res = (int)div(a, b); // �� ���� ������ 
		System.out.printf("�� ��(%d, %d) �� ���� %.1f%n", a, b, div(a, b));
		
		
		sc.close();
	}

	


	private static int sum(int a, int b) {//�޼ҵ带 ��������.
		return a + b;
	}
	private static int sub(int a, int b) {
		return a - b;
	}
	private static int mul(int a, int b) {
		return a * b;
	}
	private static double div(int n, int m) {
		return (double) n / m;
	}
}
