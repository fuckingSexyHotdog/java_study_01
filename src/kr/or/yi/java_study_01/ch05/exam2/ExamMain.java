package kr.or.yi.java_study_01.ch05.exam2;

import java.security.acl.Owner;
import java.util.Arrays;
import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
//		ColorTv myTv = new ColorTv(32, 1024);
//		myTv.printProperty();//1번 문제
//		IpTv myIpTv = new IpTv("192.1.1.2", 32, 2048);
//		myIpTv.printProperty();//2번 문제

		Scanner sc = new Scanner(System.in);
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run(sc);// 3번 문제
//		Km2Mile toMile = new Km2Mile(1.6);
//		toMile.run(sc);// 4번 문제

//		ColorPoint cp = new ColorPoint(5, 5, "yellow");
//		cp.setXY(10, 20);
//		cp.setColor("red");
//		String str = cp.toString();
//		System.out.println(str + "입니다.");// 5번 문제
//		ColorPoint zeroPoint = new ColorPoint();
//		System.out.println(zeroPoint.toString()+"입니다.");
//		ColorPoint cp2 = new ColorPoint(10, 10);
//		cp2.setXY(5, 5);
//		cp2.setColor("red");
//		System.out.println(cp2.toString()+"입니다.");//6번 문제
//		Point3D p = new Point3D(1, 2, 3);
//		System.out.println(p.toString() + "입니다.");
//		p.moveUp();
//		System.out.println(p.toString() + "입니다.");
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p.toString() + "입니다.");
//		p.move(100, 200, 300);
//		System.out.println(p.toString() + "입니다.");//7번 문제
//		PositivePoint p2 = new PositivePoint();
//		p2.move(10, 10);
//		System.out.println(p2.toString() + "입니다.");
//		p2.move(-5, -5);
//		System.out.println(p2.toString() + "입니다.");
//		PositivePoint p3 = new PositivePoint(-10, -10);
//		System.out.println(p3.toString() + "입니다.");//8번 문제

//		System.out.print("총 스택 저장공간의 크기 입력 >> ");
//		int capacity = sc.nextInt();
//		Stack ss = new StringStack(capacity);
//		String res;
//		for (int i = 0; i < capacity + 1; i++) {
//			System.out.print("문자열 입력 >> ");
//			res = sc.next();
//			if (res.equals("그만")) {
//				break;
//			}
//			ss.push(res);
//		}
//		System.out.println("스택에 저장된 모든 문자열 팝");
//		for (int i = ss.length() - 1; i > -1; i--) {
//			res = ss.pop();
//			System.out.println(res == null ? "" : res + " ");
//		}//9번 문제 (다시 한번 이해하도록 해보자)

//		System.out.print("총 스택 저장 공간의 크기 입력 >>");
//		int size = sc.nextInt();
//		String[] strArr = new String[size];
//		int i = 0;
//		while (true) {
//			System.out.print("문자열 입력>>");
//			String tex = sc.next();
//			if (tex.equals("그만")) {
//				break;
//			}
//			if (i >= strArr.length) {
//				System.out.println("스택이 꽉 차서 푸시 불가!!!");
//				continue;
//			}
//			strArr[i] = tex;
//			i++;
//		}
//		System.out.print("스택에 저장된 모든 문자열 팝 : ");
//		for (int j = strArr.length - 1; j >= 0; j--) {
//			System.out.print(strArr[j] + " ");
//		}

//		Dictionary dic = new Dictionary(10);
//		dic.put("황기태", "자바");
//		dic.put("이재문", "파이선");
//		dic.put("이재문", "C++");// 이재문의 값을 C++로 수정
//		System.out.println("이재문의 값은 " + dic.get("이재문"));
//		System.out.println("황기태의 값은 " + dic.get("황기태"));
//		dic.delete("황기태");// 황기태 아이템 삭제
//		System.out.println("황기태의 값은 " + dic.get("황기태"));// 삭제된 아이템 접근 // 10번 문제

//		Calc2 c = new Calc2();
//		c.setValue();
//		c.calclate();
//		System.out.println(c.calclate());//11번 문제
		System.out.print("두 정수와 연산자를 입력하시오. >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();
		Calc[] calc = { new Add(), new Sub(), new Mul(), new Div() };
		String[] operArr = { "+", "-", "*", "/" };
		
		int findOper = Arrays.binarySearch(operArr, oper);
		calc[findOper] =
//		switch(oper) {
//		case "+": {
//			calc[0].setValue(a, b);
//			calc[0].calclate();
//			break;
//		}
//		case "-": {
//			calc[1].setValue(a, b);
//			calc[1].calclate();
//			break;
//		}
//		case "*": {
//			calc[2].setValue(a, b);
//			calc[2].calclate();
//			break;
//		}
//		case "/": {
//			calc[3].setValue(a, b);
//			calc[3].calclate();
//			break;
//		}
//			
//		}
		sc.close();
	}

}
