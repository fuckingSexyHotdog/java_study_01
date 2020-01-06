package kr.or.yi.java_study_01.ch04;

public class Circle /* extends Object 생략되어 있음*/{
	//class는 사용자 정의 변수
	public int radius;
	public String name;
	
	public Circle() {
		/* super(); 생략되어 있음. 부모 생성자를 호출*/
	}
	
	public Circle(String name) {
		this.name = name;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 *radius*radius;
	}

	@Override
	public String toString() {
		return String.format("반지름 %s, 제품명 %s, 면적 %s", radius, name, getArea());
	}
	
	
	
}
