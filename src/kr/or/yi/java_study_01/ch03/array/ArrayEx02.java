package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx02 {
	public static void main(String[] args) {
		char[] chArr = new char[26];
		prnArray(chArr);
		makeArray(chArr);
		prnArray(chArr);
		//위치교환(swap) prnArray(chArr);할시  z y . . . a가 아니라 y z . . . a로 바꿔보자
		char temp = chArr[0];
		chArr[0]= chArr[1];
		chArr[1]= temp;
		prnArray(chArr);
	}

	private static void prnArray(char[] Arr) {
		for(int i=0; i<Arr.length; i++) {
			System.out.printf("%c ", Arr[i]);
		}
		System.out.println();
	}

	private static void makeArray(char[] Arr) {
		char ch= 'z';
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = ch--;
		}
	}
}
