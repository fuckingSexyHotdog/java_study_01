package kr.or.yi.java_study_01.ch04.exam;

class TV {
	private String brand;
	private int prodYear;
	private int tvInch;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getProdYear() {
		return prodYear;
	}

	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}

	public int getTvInch() {
		return tvInch;
	}

	public void setTvInch(int tvInch) {
		this.tvInch = tvInch;
	}

	public TV(String brand, int prodYear, int tvInch) {
		this.brand = brand;
		this.prodYear = prodYear;
		this.tvInch = tvInch;
	}

	public void show() {
		System.out.println(this.brand + "에서 만든 " + this.prodYear + "년형 " + this.tvInch + " 인치 TV");

	}

}
