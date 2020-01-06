package kr.or.yi.java_study_01.ch04.Exam2019_12_16;

import java.util.Arrays;

public class Max {
	public static int max(int[] arr) {
		int search = 0;
		try {
			if (arr.length == 0) {
				search = -999999;
			}
			for (int i = 0; i < arr.length; i++) {
				if (search < arr[i]) {
					search = i;
				}
			}
		} catch (NullPointerException e) {
			search = -999999;
		}
		return search;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("최댓값 : " + max(data));
		System.out.println("최댓값 : " + max(null));
		System.out.println("최댓값 : " + max(new int[] {}));
//		int[] b = {};
//		b = null;
//		System.out.println(b.length);
	}
}
