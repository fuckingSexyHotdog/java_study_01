package kr.or.yi.java_study_01.ch03;

public class ForLoop02 {
	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;
		for(int i=0; i<101; i++) {
			sum = sum + i;
			if (i % 2 == 1) {
				odd = odd + i;
			}
			else {
				even = even + i;
			}
		}
		System.out.println(odd);
		System.out.println(even);
		System.out.println(sum);
		System.out.printf("Ȧ���� �� %d%n¦���� �� %d%n��ü�� ��%d%n", odd, even, odd+even);

		for(int j=0; j<5; j++) {
			for(int i=0;i<5-j;i++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}
	

