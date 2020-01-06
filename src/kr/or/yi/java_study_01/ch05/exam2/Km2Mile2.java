package kr.or.yi.java_study_01.ch05.exam2;

class Km2Mile2 extends Converter2{

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDesttring() {
		return "mile";
	}
}
