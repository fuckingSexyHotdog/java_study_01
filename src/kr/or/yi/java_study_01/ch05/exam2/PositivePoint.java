package kr.or.yi.java_study_01.ch05.exam2;

class PositivePoint extends Point {

	public PositivePoint() {
		setX(0);
		setY(0);
	}

	public PositivePoint(int x, int y) {
		if (x <= 0) {
			x = 0;
		}
		if (y <= 0) {
			y = 0;
		}
		setX(x);
		setY(y);
	}

	@Override
	protected void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)의 점", getX(), getY());
	}

}
