package kr.or.yi.java_study_01.ch02;

//


/**
 * �ҽ����� : Hello.java
 * �ۼ��� : 2019_11_20
 * �Ʒ� Ŭ������ ���� ������ ����
 * alt + shift + j
 *
 */
public class Hello {
	public static void main(String[] args) {
		final double PI = 3.141592;
		//��������(�Լ� �� ����� ����)
		int i = 20; //����� �ʱ�ȭ
		int s; //������ ���� ����
		char a; //������ ���� ����
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a + "Hello" + s);
		System.out.printf("%c %s %d", a, "Hello", s);
		// 'a' + "Hello" + 30
		// "a" + "Hello" + 30
		// "aHello" + 30
		// "aHello" + "30"
		System.out.println(a + "Hello" + s + 10);
		// "aHello3010"
		System.out.println(a + "Hello" + (s + 10));
		// "aHello40"
//		System.out.println("n = %d, m = %d%n", n, m);
		//���������� ã�� �� ���⿡ error
		System.out.println("\"java's ��ƴ�\"");

	
	}

	private static int sum(int n, int m) {
		return n + m;
	}
}
