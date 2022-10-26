import java.util.Scanner;

public class flowchartTest_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.print("첫번째 정수를 입력해주세요.>");
		a = scn.nextInt();
		System.out.print("두번째 정수를 입력해주세요.>");
		b = scn.nextInt();
		System.out.print("세번째 정수를 입력해주세요.>");
		c = scn.nextInt();

		if (a < b) {
			if (a < c) {
				System.out.print("가장 작은 수: " + a);
			} else {
				System.out.print("가장 작은 수: " + c);
			} 
			if (b < c) {
				System.out.print("가장 작은 수: " + b);
			}
		}
	}

}
