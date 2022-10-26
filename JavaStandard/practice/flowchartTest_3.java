import java.util.Scanner;

public class flowchartTest_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int age;
		
		System.out.print("나이를 입력해주세요.>");
		age=scn.nextInt();

		if(age>8 || age<=60) {
			System.out.print("5000원");
		} else {
			System.out.print("무료");
		}

		
	}

}
