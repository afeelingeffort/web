/*
1. 무한반복 구구단(입력 2개) 
*/
import java.util.Scanner;

public class TestProject_10_99dan {

	public static void main(String[] args) {
		
		while(true)
		{Scanner sc=new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		System.out.println("숫자를 입력하세요.");
		
		int a;
		int b;
		
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.printf("%d",a*b);
		System.out.println();
		
		}
	}
	
}
