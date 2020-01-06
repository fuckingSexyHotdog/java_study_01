package kr.or.yi.java_study_01.ch05.override.inter;

public interface PhoneInterface {
	// 상수, 추상 메소드, default 메호드
	public static final int TIMEOUT = 1000;// 상수

	public abstract void sendCall();// 추상 메소드

	void redciveCall();// 추상 메소드

	default void prnLogo() {
		System.out.println("** PHone **");
	}
}
