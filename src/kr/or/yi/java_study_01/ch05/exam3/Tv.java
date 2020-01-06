package kr.or.yi.java_study_01.ch05.exam3;

class Tv {
	private int size;

	public Tv() {
		// TODO Auto-generated constructor stub
	}

	public Tv(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void printProperty() {
		System.out.printf("%d인치", size);
	}
}
