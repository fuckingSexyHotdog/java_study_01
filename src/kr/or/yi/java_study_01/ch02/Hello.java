package kr.or.yi.java_study_01.ch02;

//


/**
 * 소스파일 : Hello.java
 * 작성일 : 2019_11_20
 * 아래 클래스에 대한 설명을 적음
 * alt + shift + j
 *
 */
public class Hello {
	public static void main(String[] args) {
		final double PI = 3.141592;
		//지역변수(함수 내 선언된 변수)
		int i = 20; //선언과 초기화
		int s; //정수형 변수 선언
		char a; //문자형 변수 선언
		
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
		//지역변수를 찾을 수 없기에 error
		System.out.println("\"java's 어렵다\"");

	
	}

	private static int sum(int n, int m) {
		return n + m;
	}
}
