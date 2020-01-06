package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[][] intArray = { { 1, 24, 23, 22, 20 }, { 16, 14, 13, 12, 15 }, { 21, 19, 18, 17, 11 }, { 8, 9, 10, 7, 6 },
				{ 5, 3, 4, 2, 25 } };
//		System.out.println(array2DanLength(intArray));
		prnArray(intArray);
//		twoDanSort(intArray);
	}

	private static int array2DanLength(int[][] intArray) {
		return (intArray.length) * (intArray[intArray.length - 1].length);
	}

	private static void twoDanSort(int[][] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - 1; j++) {
				System.out.print(intArray[i][j] + ", ");
				if (j == 3) {
					System.out.print(intArray[i][j + 1]);
				}
			}
			System.out.println("");
		}
	}

	private static void prnArray(int[][] intArray) {
		for (int u = 0; u < array2DanLength(intArray); u++) {
			for (int i = 0; i < intArray.length; i++) {
				if (i != 4) {
					for (int j = 0; j < intArray.length - 1; j++) {
						if (intArray[i][j] > intArray[i][j + 1]) {
							int temp = intArray[i][j + 1];
							intArray[i][j + 1] = intArray[i][j];
							intArray[i][j] = temp;
						}
						System.out.print(intArray[i][j] + ", ");
						if (j + 1 == 4) {
							if (intArray[i][j + 1] > intArray[i + 1][0]) {
								int temp2 = intArray[i + 1][0];
								intArray[i + 1][0] = intArray[i][j + 1];
								intArray[i][j + 1] = temp2;
							}
							System.out.print(intArray[i][j + 1] + " ");
						}

					}
					System.out.println("다음");
				} else {
					for (int j = 0; j < intArray.length - 1; j++) {
						if (intArray[i][j] > intArray[i][j + 1]) {
							int temp = intArray[i][j + 1];
							intArray[i][j + 1] = intArray[i][j];
							intArray[i][j] = temp;
						}
						System.out.print(intArray[i][j] + ", ");
						if (j + 1 == 4) {
							System.out.print(intArray[i][j + 1] + " ");
						}
					}
					System.out.println("다음");
				}
			}
			System.out.println("-------------------------------------------");
		}
	}
}
