package kr.or.yi.java_study_01.ch03.array;

public class TwoArray {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		double fourClassSum = 0;
		for(int i=0; i<score.length;i++) {
			double yearSum=0;
			for(int j=0; j<score[i].length; j++) {
				fourClassSum= fourClassSum + score[i][j];
				System.out.printf("%d학년 %d학기 성적 %.1f, ",i+1, j+1, score[i][j]);
				yearSum=yearSum + score[i][j];
			}
			System.out.printf("%d학년 평균 %.2f%n", i+1, (yearSum/2));
		}
		System.out.printf("전체학기 평균 %.3f", (fourClassSum/8));
	}
}
