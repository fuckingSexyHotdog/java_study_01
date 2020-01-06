package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class scoreAverage {
	public static void main(String[] args) {
		Random rnd = new Random(123456789);
		int [][] intArr = new int [12][3];
		String [] yiname = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주"};
		score(intArr, rnd);
		System.out.println("이름        국어                 영어                 수학                 총점              평균");
		System.out.println("====================================================");
		score2(yiname, intArr);

	}

	private static void score2(String[] yiname, int[][] intArr) {
		double kor = 0;
		double eng = 0;
		double math = 0;
		double hap = 0;
		double hapAvg = 0;
		for(int i=0; i<yiname.length;i++) {
			System.out.print(yiname[i] + "      ");
			int hap2 = 0;
			double hapAvg2 = 0;
			for(int j=0; j<intArr[i].length;j++) {
				System.out.print(intArr[i][j] + "        ");
				hap2=hap2+intArr[i][j];
				if(j==0) {
					kor=kor+intArr[i][j];
				}
				else if(j==1) {
					eng=eng+intArr[i][j];
				}
				else {
					math=math+intArr[i][j];
				}
			}
			hapAvg2=(hap2/3);
			hap=hap+hap2;
			hapAvg=hapAvg+hapAvg2;
			System.out.print(hap2 + "      ");
			System.out.printf("%.2f%n", hapAvg2);
		}
		kor= kor/12;
		eng= eng/12;
		math= math/12;
		hapAvg=hapAvg/12;
		hap=hap/12;
		System.out.println("====================================================");
		System.out.println("전체        국어                 영어                 수학                 총점              평균");
		System.out.println("====================================================");
		System.out.printf("      %.2f     %.2f     %.2f     %.2f   %.2f", kor, eng, math, hap, hapAvg);
	}

	private static void score(int[][] intArr, Random rnd) {	
		for(int i=0;i<intArr.length;i++) {
			for (int j=0; j<intArr[i].length; j++) {
				intArr[i][j] =rnd.nextInt(40)+60;
			}
		}	
	}
}












