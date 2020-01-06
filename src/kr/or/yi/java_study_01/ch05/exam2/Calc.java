package kr.or.yi.java_study_01.ch05.exam2;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	};

	public abstract int calclate();
}
