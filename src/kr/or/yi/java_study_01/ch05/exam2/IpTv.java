package kr.or.yi.java_study_01.ch05.exam2;

class IpTv extends ColorTv {
	private String ip;

	public IpTv() {
		// TODO Auto-generated constructor stub
	}

	public IpTv(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.ip + " 주소의 ");
		super.printProperty();
	}

}
