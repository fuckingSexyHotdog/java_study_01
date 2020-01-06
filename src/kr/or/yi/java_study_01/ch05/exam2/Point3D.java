package kr.or.yi.java_study_01.ch05.exam2;

class Point3D extends Point {
	private int z;

	public Point3D() {
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s)의 점", getX(), getY(), getZ());
	}

}
