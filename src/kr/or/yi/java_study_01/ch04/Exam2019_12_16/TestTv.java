package kr.or.yi.java_study_01.ch04.Exam2019_12_16;

public class TestTv {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.setChannel(100);
		t.setVolume(0);
		System.out.println("CH : " + t.getChannel() + ", VOL : " + t.getVolume());

		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.getChannel() + ", VOL : " + t.getVolume());

		t.setVolume(100);
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : " + t.getChannel() + ", VOL : " + t.getVolume());
	}
}
