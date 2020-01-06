package kr.or.yi.java_study_01.ch05.exam2;

class Won2Dollar extends Converter {

	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDesttring() {
		return "달러";
	}

}
