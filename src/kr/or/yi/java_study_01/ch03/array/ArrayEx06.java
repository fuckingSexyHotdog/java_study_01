package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx06 {
	public static void main(String[] args) {
		int [][] intArray = {{10, 9, 81, 3}, {13, 3, 72, 74}, {63, 69, 18, 58}, {81, 82, 44, 17}};
		prnArray(intArray);
		sort(intArray);
		prnArray(intArray);
	}

	private static void sort(int[][] intArray) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray.length;j++) {
				if(i!=intArray.length-1) {
					if(min>intArray[i][j]) {
						
					}
				}
				else {
				}
				System.out.printf("%2d ", intArray[i][j]);
			}
			System.out.println("");
		}	
	}

	private static void prnArray(int[][] intArray) {
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray.length;j++) {
				System.out.printf("%2d ", intArray[i][j]);
			}
			System.out.println("");
		}		
	}
}
