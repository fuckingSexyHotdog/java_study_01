package kr.or.yi.java_study_01.ch05.override;

class Shape {
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}
