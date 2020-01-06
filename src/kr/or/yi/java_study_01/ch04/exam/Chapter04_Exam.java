package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

public class Chapter04_Exam {
	public static void main(String[] args) {
//		TV myTV = new TV("LG", 2017, 32);
//		myTV.show(); // 1번 문제
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수학, 과학, 영어 순으로 3개의 성적 입력 >>");
//		int math = sc.nextInt();
//		int science = sc.nextInt();
//		int english = sc.nextInt();
//		Grade myGrade = new Grade(math, science, english);
//		System.out.println("평균은" + myGrade.averge());// 2번 문제
//
//		Song mySong = new Song();
//		mySong.setTitle("Dancing Queen");
//		mySong.setArtist("ABBA");
//		mySong.setYear(1978);
//		mySong.setCountry("스웨덴");
//		mySong.show();// 3번 문제
//
//		Rectangle myRectangle = new Rectangle(2, 2, 8, 7);
//		Rectangle myRectangle2 = new Rectangle(5, 5, 6, 6);
//		Rectangle myRectangle3 = new Rectangle(1, 1, 10, 10);
//		myRectangle.show();
//		System.out.println("myRectangle2의 면적은 " + myRectangle2.square());
//		if (myRectangle3.contains(myRectangle))
//			System.out.println("myRectangle3은 myRectangle을 포함합니다.");
//		if (myRectangle3.contains(myRectangle2))
//			System.out.println("myRectangle3은 myRectangle2을 포함합니다.");// 4번 문제
//
//		MonthSchedule oct = new MonthSchedule(31);
//		oct.run(sc);// 7번 문제
//
//		PhoneBook phn = new PhoneBook();
//		phn.run(sc);// 8번 문제
//
//		int[] array1 = { 1, 5, 7, 9 };
//		int[] array2 = { 3, 6, -1, 100, 77 };
//		int[] array3 = ArrayUtil.concat(array1, array2);
//		ArrayUtil.print(array3);// 9번 문제
//
//		String word = null;
//		Dictionary.kor2eng(word);// 10번 문제
//
//		Add ad = new Add();
//		Sub sb = new Sub();
//		Mul mu = new Mul();
//		Div di = new Div();
//		System.out.println(ad.calculate(sc));
//		System.out.println(sb.calculate(sc));
//		System.out.println(mu.calculate(sc));
//		System.out.println(di.calculate(sc));// 11번 문제
//		
//		Concert today = new Concert();
//		today.run();
//		sc.close();
		Scanner sc = new Scanner(System.in);
		Concert con = new Concert();
		con.run(sc);
		sc.close();
	}
}
