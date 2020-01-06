package kr.or.yi.java_study_01.ch04.exam;

import java.util.Arrays;

class ArrayUtil {
	
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		return c;
	}

	public static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
