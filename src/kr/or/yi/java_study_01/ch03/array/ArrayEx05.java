package kr.or.yi.java_study_01.ch03.array;

import java.time.chrono.MinguoChronology;

public class ArrayEx05 {
	public static void main(String[] args) {
		int [] intArray = {31, 18, 11, 29, 30, 10, 41, 10, 3, 90};
		prnArray(intArray);
//		sort(intArray);
		sort2(intArray);
		prnArray(intArray);
	}

	private static void sort2(int[] intArray) {
		
		for(int i=0; i<intArray.length; i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0; j+i<intArray.length;j++) {
				if (min>intArray[j+i]) {
					int temp = min;
					min= intArray[j+i];
					intArray[j+i]=temp;
				}	
			}
			intArray[i]=min;
		}	
	}

	private static void sort(int[] intArray) {
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray.length-1-i;j++) {
				if (intArray[j]>intArray[j+1]) {
					int temp = intArray[j+1];
					intArray[j+1]= intArray[j];
					intArray[j]=temp;
				}
			}
		}
	}

	private static void prnArray(int[] intArray) {
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
	}
}
