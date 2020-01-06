package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class JoGunMoon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		buy(sc);
		moonJa(sc);// 좀있다가 하자
		woobang(sc);
		biMan(sc);
		threesu(sc);
		sc.close();
	}

	private static void threesu(Scanner sc) {
		System.out.println("정수 3개 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b) {
			if (b == c) {
				System.out.println("가장 작은 수는" + a + "입니다.");
			} else if (b > c) {
				System.out.println("가장 작은 수는" + c + "입니다.");
			} else {
				System.out.println("가장 작은 수는" + a + "입니다.");
			}
		} else if (a > b) {
			if (b == c) {
				System.out.println("가장 작은 수는" + c + "입니다.");
			} else if (b > c) {
				System.out.println("가장 작은 수는" + c + "입니다.");
			} else {
				System.out.println("가장 작은 수는" + b + "입니다.");
			}
		} else {
			if (b == c) {
				System.out.println("가장 작은 수는" + a + "입니다.");
			} else if (b > c) {
				if (c == a) {
					System.out.println("가장 작은 수는" + c + "입니다.");
				} else if (c > a) {
					System.out.println("가장 작은 수는" + a + "입니다.");
				} else {
					System.out.println("가장 작은 수는" + c + "입니다.");
				}
			} else {
				System.out.println("가장 작은 수는" + a + "입니다.");
			}
		}
	}

	private static void biMan(Scanner sc) {
		System.out.println("나이가 어떻게 되시나요?");
		int year = sc.nextInt();
		System.out.println("몸무게랑 키가 어떻게 되세요?  단위(몸무게:kg, 키:m)");
		int moogae = sc.nextInt();
		double kee = sc.nextDouble();
		double kwf = (Math.round(((moogae / (kee * kee)) * 10)));
		double kwf2 = kwf / 10.0;
		if ((year > 19) && (year < 30)) {
			if (kwf2 <= 17.9) {
				System.out.println("저체중");
				System.out.println(kwf);
			} else if ((kwf2 >= 18.0) && (kwf2 <= 23.9)) {
				System.out.println("표준체중");
				System.out.println(kwf2);
			} else if ((kwf2 >= 24.0) && (kwf2 <= 30.0)) {
				System.out.println("과체중");
				System.out.println(kwf2);
			} else {
				System.out.println("비만");
				System.out.println(kwf2);
			}
		} else if ((year > 29) && (year < 40)) {
			if (kwf2 <= 18.4) {
				System.out.println("저체중");
			} else if ((kwf2 >= 18.5) && (kwf2 <= 24.9)) {
				System.out.println("표준체중");
			} else if ((kwf2 >= 25.0) && (kwf2 <= 30.0)) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}
		} else {
			System.out.println("20대랑 30대만 측정이 가능합니다. 죄송해요......");
		}
	}

	private static void woobang(Scanner sc) {
		System.out.println("자유이용권드릴까요? 입장권 드릴까요?");
		String free = sc.next();
		if (free.equals("자유이용권")) {
			System.out.println("나이가 어떻게 되시고 몇시에 들어가실건가요? 운영시간은 9시부터 24시까지입니다.");
			int year = sc.nextInt();
			int time = sc.nextInt();
			if ((year >= 65) || ((year >= 3) && (year < 13))) {
				if ((time > 8) && (time < 17)) {
					System.out.println("요금은 25000원입니다.");
				} else if ((time > 16) && (time < 25)) {
					System.out.println("요금은 21000원입니다.");
				} else {
					System.out.println("운영시간이 종료된 시간입니다.");
				}
			} else if ((year > 12) && (year < 65)) {
				if ((time > 8) && (time < 17)) {
					System.out.println("요금은 34000원입니다.");
				} else if ((time > 16) && (time < 25)) {
					System.out.println("요금은 29000원입니다.");
				} else {
					System.out.println("운영시간이 종료된 시간입니다.");
				}
			} else {
				System.out.println("무료입니다.");
			}
		} else if (free.equals("입장권")) {
			System.out.println("나이가 어떻게 되시고 몇시에 들어가실건가요? 운영시간은 9시부터 24시까지입니다.");
			int year = sc.nextInt();
			int time = sc.nextInt();
			if ((year >= 65) || ((year >= 3) && (year < 13))) {
				if ((time > 8) && (time < 17)) {
					System.out.println("요금은 20000원입니다.");
				} else if ((time > 16) && (time < 25)) {
					System.out.println("요금은 17000원입니다.");
				} else {
					System.out.println("운영시간이 종료된 시간입니다.");
				}
			} else if ((year > 12) && (year < 65)) {
				if ((time > 8) && (time < 17)) {
					System.out.println("요금은 27000원입니다.");
				} else if ((time > 16) && (time < 25)) {
					System.out.println("요금은 23000원입니다.");
				} else {
					System.out.println("운영시간이 종료된 시간입니다.");
				}
			} else {
				System.out.println("무료입니다.");
			}
		} else {
			System.out.println("자유이용권이나 입장권 밖에 없습니다.");
		}
	}

	private static void moonJa(Scanner sc) {
		System.out.println("알파벳을 입력해주세요.");
		char a = sc.nextLine().charAt(0);
		int b = (int) a;
		if ((b > 64) && (b < 91)) {
			b = b + 32;
			System.out.printf("%c", b);
		} else if ((b > 96) && (b < 123)) {
			System.out.println("대문자를 입력해주세요.");
		} else {
			System.out.println("알파벳을 입력해주세요!!!!!!");
		}
	}

	private static void buy(Scanner sc) {
		System.out.println("물건 사실려구요 ? 개당 100원이고 10개이상 사시면 10%할인, 20개이상 사시면 15%할인, 100개 이상 사시면 20%할인해드립니다. >>(갯수:  )");
		int xyz = sc.nextInt();
		int x = 100;
		double t = x * 0.9;
		double y = x * 0.85;
		double z = x * 0.8;
		if (xyz >= 100) {
			System.out.printf("구매가격은 %d개에 %.0f원해서 총 가격 %.0f원 입니다.", xyz, z, xyz * z);
		} else if (xyz >= 20) {
			System.out.printf("구매가격은 %d개에 %.0f원해서 총 가격 %.0f원 입니다.", xyz, y, xyz * y);
		} else if (xyz >= 10) {
			System.out.printf("구매가격은 %d개에 %.0f원해서 총 가격 %.0f원 입니다.", xyz, t, xyz * t);
		} else {
			System.out.printf("구매가격은 %d개에 %d원해서 총 가격 %d원 입니다.", xyz, x, xyz * x);
		}
	}
}
