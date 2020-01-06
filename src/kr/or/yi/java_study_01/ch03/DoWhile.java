package kr.or.yi.java_study_01.ch03;

public class DoWhile {
	public static void main(String[] args) {
		char c='a';
		
//		do {
//			System.out.print(c);
//			c = (char)(c+1);
//		} while (c<='z');
//		for (int x=1; x<10;x++) {
//			if(x==5) {
//				continue;
//			}
//			for(int y=2; y<10;y++) {
//				System.out.printf("%d * %d = %2d ", y,x,(y*x));
//			}
//			System.out.println("");
//		}
//		for (int x=1; x<10;x++) {
//			if(x>5) {
//				break;
//			}
//			for(int y=2; y<10;y++) {
//				System.out.printf("%d * %d = %2d ", y,x,(y*x));
//			}
//			System.out.println("");
//		}
//		for (int x=1; x<10;x++) {
//			if(x>5) {
//				break;
//			}
//			for(int y=2; y<10;y++) {
//				if(y>5) {
//					break;
//				}
//				System.out.printf("%d * %d = %2d ", y,x,(y*x));
//			}
//			System.out.println("");
//		}
		forSum();
		whileSum();
		doWhileSum();
	}

	private static void doWhileSum() {
		int sum=0;
		int evensum=0;
		int oddsum=0;
		int threesum=0;
		int i=1;
		do {
			if(i%2==1) {
				oddsum=oddsum+i;
			}
			else {
				evensum=evensum+i;
			}
			if(i%3==0) {
				threesum=threesum+i;
			}
			sum=sum+i;
			i++;
		} while(i<101);
		System.out.println(sum);
		System.out.println(evensum);
		System.out.println(oddsum);
		System.out.println(threesum);
	}

	private static void whileSum() {
		int sum=0;
		int evensum=0;
		int oddsum=0;
		int threesum=0;
		int i=1;
		while(i<101) {
			if(i%2==1) {
				oddsum=oddsum+i;
			}
			else {
				evensum=evensum+i;
			}
			if(i%3==0) {
				threesum=threesum+i;
			}
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		System.out.println(evensum);
		System.out.println(oddsum);
		System.out.println(threesum);
	}

	private static void forSum() {
		int sum=0;
		int evensum=0;
		int oddsum=0;
		int threesum=0;
		for(int i=1;i<101;i++) {
			if(i%2==1) {
				oddsum=oddsum+i;
			}
			else {
				evensum=evensum+i;
			}
			if(i%3==0) {
				threesum=threesum+i;
			}
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println(evensum);
		System.out.println(oddsum);
		System.out.println(threesum);
	}

}
