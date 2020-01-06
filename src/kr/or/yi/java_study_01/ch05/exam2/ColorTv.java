package kr.or.yi.java_study_01.ch05.exam2;

class ColorTv extends Tv {
	private int color;

	public ColorTv() {
	}

	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void printProperty() {
		System.out.println(this.getSize() + "인치 " + this.color + "컬러");
	}
}
