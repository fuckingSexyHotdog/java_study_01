package kr.or.yi.java_study_01.ch05.exam2;

interface Stack {
	int length();//현재 스택에 저장된 개수 리턴

	int capacity();//스택의 전체 저장 가능한 개수 리턴

	String pop();//스택의 탑에 저장된 실수 리턴

	boolean push(String val);//스택의 탑에 실수 저장
}
