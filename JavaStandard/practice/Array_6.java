import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] day = new int[13];
		int i, year;

		for (i = 1; i < day.length; i++) {
			if (i == 2) {
				day[i] = 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				day[i] = 30;
			} else {
				day[i] = 31;
			}
		}
		while (true) {
			System.out.print("년도 : ");
			year = scn.nextInt();
			System.out.print("월 : ");
			i = scn.nextInt();

			if (i == 0) {
				break;
			}
			if (i < 1 || i > 12) {
				System.out.print("잘못 입력하셨습니다.");
				continue;
			} else if (i == 2) {
				if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0)) {
					day[2] = 29;
				} else {
					day[2] = 28;
				}
			}
			System.out.printf("입력하신 달의 날수는 %d일 입니다.%n", day[i]);
		}
	}

}
