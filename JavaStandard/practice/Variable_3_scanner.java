import java.util.Scanner;

public class Variable_3_scanner {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		System.out.println("첫번째 정수 : "+num1+" 두번째 정수 : "+num2);
		System.out.print("두 수의 합   : ");
		System.out.println(num1+num2);

	}

}
