package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx07 {
	public static void main(String[] args) {
//		genernalRandom();
		Random rnd = new Random(1234567);
		int[] intArr=new int[6];
		rnd_Lotto(rnd, intArr);
		int searchKey =22;
		int findIdx = findSearch(intArr, searchKey);
		System.out.printf("%s 배열에서 %d의 위치는 %d입니다.%n", Arrays.toString(intArr), searchKey, findIdx);
		sort(intArr);
		findIdx = binarySearch(intArr, searchKey);
		System.out.printf("%s 배열에서 %d의 위치는 %d입니다.%n", Arrays.toString(intArr), searchKey, findIdx);
	}

	private static void sort(int[] intArr) {
		for(int i=0; i<intArr.length-1;i++) {
			for(int j=0;j<intArr.length-1;j++) {
				if(intArr[j]>intArr[j+1]) {
					int temp =0;
					temp =intArr[j+1];
					intArr[j+1]= intArr[j];
					intArr[j]=temp;
				}
				
			}
			System.out.printf("%s ", Arrays.toString(intArr));
			System.out.println("");
		}
	}

	private static int binarySearch(int[] intArr, int searchKey) {
		int left = 0;
		int right = intArr.length-1;
		
		while (left<=right) {
			int mid = (left + right)/2;
			if (intArr[mid]>searchKey) {
				right = mid -1;
			}
			else if (intArr[mid]<searchKey) {
				left = mid +1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}

	private static int findSearch(int[] intArr, int searchKey) {
		for (int i=0; i<intArr.length; i++) {
			if(intArr[i]==searchKey) {
				return i;
			}
		}
		return -1;
	}

	private static void rnd_Lotto(Random rnd, int[] intArr) {
		System.out.println(Arrays.toString(intArr));
		
		for (int i=0;i<intArr.length-1; i++) {
			intArr[i] = rnd.nextInt(45)+1;
		}
		System.out.println(Arrays.toString(intArr));
	}

	private static void genernalRandom() {
		Random rnd = new Random();
		rnd.setSeed(1234);
		for (int i=0; i<6; i++) {
			System.out.print(rnd.nextInt(45)+1 + " ");
		}
	}
}
