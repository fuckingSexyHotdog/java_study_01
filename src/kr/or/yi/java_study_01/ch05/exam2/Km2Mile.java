package kr.or.yi.java_study_01.ch05.exam2;

class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDesttring() {
		return "mile";
	}

}
