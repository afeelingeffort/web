import java.util.Scanner;

/*
2. 알바 시급 계산기
시급 입력 : 
1주 동안 며칠 일하는지 입력 : //  
1일 몇시간 일 하는지 입력 : // 시급 * 하루 근무 시간 * 일주일 근무량 * 4 
한달 월급 결과(세전) : 
*/
public class TestProject_15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			int hourly_wage = 9160;
			int working_day = 0;
			int working_hour = 0;
			int salary;

			System.out.print("본인의 시급을 입력하여 주세요.> ");
			hourly_wage = scn.nextInt();
			System.out.print("일주일 근무 일을 입력해주세요.> ");
			working_day = scn.nextInt();
			System.out.print("하루 근무 시간을 입력해주세요.> ");
			working_hour = scn.nextInt();

			salary = hourly_wage * working_day * working_hour * 4;

			System.out.printf("월급 (세전)> %,d%n", salary);

			System.out.println("continue?");
			if (scn.next().equals("no") == true);
		}
	}
}