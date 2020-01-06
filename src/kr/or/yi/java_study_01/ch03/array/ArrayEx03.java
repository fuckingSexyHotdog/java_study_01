package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] intArr = {5, 4, 3, 2, 1};
		prnArray(intArr);// 5, 4, 3, 2, 1
		sort(intArr);//정렬수행
		prnArray(intArr);// 1, 2, 3, 4, 5
	}

	private static void sort(int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr.length-1;j++) {
				if(intArr[j]>intArr[j+1]) {
					int temp=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=temp;
				}
			}
		}
	}

	private static void prnArray(int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			System.out.printf("%d ", intArr[i]);
		}
		System.out.println();
	}
}
