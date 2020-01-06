package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {
	public static void main(String[] args) {
//		hardcoding();
//		for_loop01();
//		int dan = 2;
//		for(int dan=2; dan<10; dan++) {
//			System.out.println("====" + dan + "====");
//			gugudan(dan);
//		}
		for(int y=1; y<10;y++) {
			System.out.println();
			x(y);	
		}
//		for(int i=1; i<11; i++) {
//			if(i % 2 == 0) {
//				System.out.printf("%d ", i);
//			}
//		}
//		for(int i2=2; i2<11; i2=i2+2) {
//			System.out.printf("%d ", i2);
//		}
//		for(int i2=0; i2<10; i2=i2+2, System.out.printf("%d ", i2));//�� ���� ��
	}

	private static void x(int y) {
		for(int x=2; x<10; x++) {
			System.out.printf("%d * %d = %2d  ", x, y, x*y);
		}
	}
//
//	private static void gugudan(int dan) {
//		for(int i=1; i<10; i++) {
//			System.out.printf("%d * %d = %d %n", dan, i, dan*i);
//		}
//	}
//
//	private static void for_loop01() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Hello Java" + i);
//		}
//		System.out.println("Done");
//	}
//
//	private static void hardcoding() {
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//		System.out.println("Hello JAVA");
//	}
}
