package kr.or.yi.java_study_01.ch05.exam2;

class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		super(0, 0);
		this.color = "black";
	}

	public ColorPoint(int x, int y) {
		this(x, y, "black");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	@Override
	public String toString() {
		return String.format("%s색의  %s", color, super.toString());
	}

}
