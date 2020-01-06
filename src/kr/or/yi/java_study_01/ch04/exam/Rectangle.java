package kr.or.yi.java_study_01.ch04.exam;

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	private int square;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height, int square) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.square = square;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return (width * height);
	}

	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")에서 크기가 " + this.width + "x" + this.height + "인 사각형");
	}

	public boolean contains(Rectangle myRectangle3) {
		boolean i = false;
		if (myRectangle3.x > this.x && (myRectangle3.x + myRectangle3.width) < (this.x + this.width)) {
			if (myRectangle3.y > this.y && (myRectangle3.y + myRectangle3.height) < (this.y + this.height)) {
				i = true;
			}
		}
		return i;
	}

}
