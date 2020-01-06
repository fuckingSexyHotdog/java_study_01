package kr.or.yi.java_study_01.ch05.exam3;

class ColorTv extends Tv {
	private int color;

	public ColorTv(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	@Override
	public void printProperty() {
		// TODO Auto-generated method stub
		super.printProperty();
	}
}
