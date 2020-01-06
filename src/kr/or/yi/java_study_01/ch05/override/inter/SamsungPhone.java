package kr.or.yi.java_study_01.ch05.override.inter;

public class SamsungPhone implements PhoneInterface {
	private String pName;
	private int pYear;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void redciveCall() {
		System.out.println("전화가 왔습니다.");
	}

}
