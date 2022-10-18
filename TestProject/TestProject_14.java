import java.util.Scanner;

public class TestProject_14 {

	public static void main(String[] args) {
		Scanner scn2 = new Scanner(System.in);

		int op1;
		int op2;
		String operator;
		int result = 0;

		while (true) {
			System.out.print("첫 번째 정수를 입력하세요 : ");
			op1 = scn2.nextInt();
			System.out.print("연산자를 입력하세요. (+, -, *, /, %) : ");
			operator = scn2.next();
			System.out.print("두 번째 정수를 입력하세요 : ");
			op2 = scn2.nextInt();

			if (operator.equals("+")) {
				System.out.println(op1 + op2);
			} else if (operator.equals("-")) {
				System.out.println(op1 - op2);
			} else if (operator.equals("*")) {
				System.out.println(op1 * op2);
			} else if (operator.equals("/")) {
				System.out.println(op1 / op2);
			} else if (operator.equals("%")) {
				System.out.println(op1 % op2);
			}
			
			System.out.print("continue?");
			if(scn2.next().equals("no")==true) break;
		}
	}

}