package kr.or.yi.java_study_01.ch04.exam;

class Day {
	private String work;

	public Day() {

	}

	public Day(String work) {
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void show() {
		if (work == null) {
			System.out.println("없습니다.");
			return;
		}
		System.out.println(work + "입니다.");
	}
}
