package kr.or.yi.java_study_01.ch04.exam;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;

public class CircleManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		double x;
		double y;
		int radius;
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		Circle[] big = new Circle[1];
		big[0] = new Circle(0, 0, 0);
		for (int i = 0; i < c.length; i++) {
			if (big[0].getRadius() < c[i].getRadius()) {
				big[0] = c[i];
			}
			c[i].show();
			if (i == c.length - 1) {
				System.out.print("가장 면적인 큰 원은 ");
				big[0].show();
			}
		}
		sc.close();
	}
}
