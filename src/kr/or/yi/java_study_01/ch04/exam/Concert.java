package kr.or.yi.java_study_01.ch04.exam;

import java.util.Arrays;
import java.util.Scanner;

class Concert {
	private String[][] concertTicket = {
			{ "S>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" },
			{ "A>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" },
			{ "B>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" } };

	public Concert() {

	}

	public Concert(String[][] concertTicket) {
		this.concertTicket = concertTicket;
	}

	public String[][] getConcertTicket() {
		return concertTicket;
	}

	public void setConcertTicket(String[][] concertTicket) {
		this.concertTicket = concertTicket;
	}

	public void run(Scanner sc) {
		int num;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		do {
			System.out.print("예약 :1, 조회 :2, 취소 :3, 끝내기 :4 >>");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				reservation(sc);
				break;
			}
			case 2: {
				view(sc);
				break;
			}
			case 3: {
				cancel(sc);
				break;
			}
			case 4: {
				finish();
				break;
			}
			default: {
				System.out.println("없는 메뉴입니다.");
				break;
			}
			}
		} while (!(num > 3));
	}

	private void finish() {
		System.out.println("시스템을 종료합니다.");
		
	}

	private void cancel(Scanner sc) {
		System.out.print("좌석 구분 S(1), A(2), B(3) >>");
		int seat = sc.nextInt();
		System.out.println(Arrays.toString(concertTicket[seat - 1]));
		System.out.print("이름 >>");
		String name = sc.next();
		int cnt = 0;
		for (int i = 0; i < concertTicket[seat - 1].length; i++) {
			if (name.equals(concertTicket[seat - 1][i])) {
				concertTicket[seat - 1][i] = "---";
				break;
			}
			cnt++;
			if (cnt == concertTicket[seat - 1].length) {
				System.out.println("없는 이름입니다.");
			}
		}

	}

	private void view(Scanner sc) {
		for (int i = 0; i < concertTicket.length; i++) {
			for (int j = 0; j < concertTicket[i].length; j++) {
				System.out.printf("%3s  ", concertTicket[i][j]);
			}
			System.out.println("");
		}
		System.out.println("조회를 완료하였습니다.");
	}

	private void reservation(Scanner sc) {
		while (true) {
			System.out.print("좌석 구분 S(1), A(2), B(3) >>");
			int seat = sc.nextInt();
			if (seat > 3) {
				System.out.println("좌석은 S석과 A석 그리고 B석 밖에 없습니다.");
				continue;
			}
			System.out.println(Arrays.toString(concertTicket[seat - 1]));
			System.out.print("이름 >>");
			String name = sc.next();
			System.out.print("번호 >>");
			int seatNum = sc.nextInt();
			if (seatNum > concertTicket[seat - 1].length) {
				System.out.println("없는 번호입니다.");
				continue;
			} else if (concertTicket[seat - 1][seatNum] != "---") {
				System.out.println("예약된 좌석입니다. 다른 좌석을 이용해주십시오.");
				continue;
			} else {
				concertTicket[seat - 1][seatNum] = name;
				break;
			}
		}
	}

}
