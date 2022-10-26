import java.util.Scanner;

public class flowchartTest_5 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);

		int a;
		int b;
		int c;
		int min;
		
		System.out.print("첫번째 정수를 입력하세요.>");
		a=scn.nextInt();
		System.out.print("두번째 정수를 입력하세요.>");
		b=scn.nextInt();
		System.out.print("세번째 정수를 입력하세요.>");
		c=scn.nextInt();

		if(a>=b && c>=b) {
			min=b;
		} else if(b>=c && a>=c) {
			min=c;
		} else {
			min=a;
		}
		System.out.print("가장 작은 수: "+min);
	}

}
