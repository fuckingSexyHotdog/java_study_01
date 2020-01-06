package kr.or.yi.java_study_01.ch04.exam;

import java.util.Scanner;

class PhoneBook {
	int cnt;

	public PhoneBook() {

	}

	public PhoneBook(int cnt) {
		this.cnt = cnt;
	}

	public PhoneBook(Scanner sc) {
	
	}

	public void run(Scanner sc) {
		System.out.print("인원수 >> ");
		int phnCnt = sc.nextInt();
		Phone[] phonePerson = new Phone[phnCnt];
		for (int i = 0; i < phonePerson.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸 없이 입력)");
			String name = sc.next();
			String phnNum = sc.next();
			phonePerson[i] = new Phone();
			phonePerson[i].setName(name);
			phonePerson[i].setTel(phnNum);
		}
		System.out.println("저장 되었습니다......");
		String searchPhnName;
		do {
			int zeroCnt = 0;
			System.out.print("검색할 이름 >>>");
			searchPhnName = sc.next();
			for (int i = 0; i < phonePerson.length; i++) {
				if (searchPhnName.equals(phonePerson[i].getName())) {
					System.out.println(phonePerson[i].getName() + "의 번호는 " + phonePerson[i].getTel() + " 입니다.");
					zeroCnt++;
					break;
				}
			}
			if (searchPhnName.equals("그만")) {
				break;
			}
			if (zeroCnt == 0) {
				System.out.println(searchPhnName + " 이 없습니다.");
			}
		} while (!searchPhnName.equals("그만"));
	}
}
