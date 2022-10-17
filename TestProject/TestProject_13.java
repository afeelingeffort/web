import java.util.Scanner;

/*
3. 나이를 입력 시 연령별 호칭 출력하기  
-영아, 유아, 어린이, 청소년, 청년, 장년, 중년, 노년
		String infant="영아";
		String child="유아";
		String children="어린이";
		String teenager="청소년";
		String youth="청년";
		String mature="장년";
		String middle_age="중년";
		String old_age="노년";
		
영아(아기, 신생아) : 만 1세 전(첫돌까지) // age <=1
유아 : 만 1세~6세 전후 // 1 < age <= 6 // (age > 1 && age <=6) 1~6
어린이(아동, 초등생) : 만 6세~13세 // age > 6 && age <= 13
청소년 : 만 13세~18세 // age > 13 && age <=18
청년 : 만 19세~34세  // age >= 19 && age <=34
장년 : 만 35세~49세 // age >= 35 && age <= 49
중년 : 만 50세~64세 // age >=50 && age <=64
노년 : 만 65세 이상  // age >=65
*/
public class TestProject_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = 0;

		while (true) {
			System.out.print("나이를 입력해주세요.>");
			age = scn.nextInt();

			if (age <= 1) {
				System.out.println("영아");
			} else if ((age > 1) && (age <= 6)) {
				System.out.println("유아");
			} else if ((age > 6) && (age <= 13)) {
				System.out.println("어린이");
			} else if (age > 13 && age <= 18) {
				System.out.println("청소년");
			} else if (age >= 19 && age <= 34) {
				System.out.println("청년");
			} else if (age >= 35 && age <= 49) {
				System.out.println("장년");
			} else if (age >= 50 && age <= 64) {
				System.out.println("중년");
			} else {
				System.out.println("노년");
			}

			System.out.println("continue?");
			if ((scn.next()).equals("no") == true)
				break;
		}
	}

}
