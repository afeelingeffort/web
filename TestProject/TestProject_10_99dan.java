/*
1. 무한반복 구구단(입력 2개) 
-1~9단 2차원 배열에 저장하기
*/
import java.util.Scanner;

public class TestProject_10_99dan 
{
	public static void main(String[] args) 
	{
		int[][] gugudan=new int[10][10];
		// 반복적으로 쓰는 변수는 상위에 선언하는 게 좋다.
		Scanner sc=new Scanner(System.in);
		int a, b;
		while(true)
		{
			System.out.print("숫자를 입력하세요 : "); // 친철하게 써라.
			a = sc.nextInt();
			System.out.print("숫자를 입력하세요 : ");
			b =sc.nextInt();
			System.out.printf("결과 값 : %d%n",a*b); // 굳이 System.out.println 또 쓸 필요가 없다.
			
			for(int i=1; i<gugudan.length; i++) {
				for(int j=1; j<gugudan[i].length; j++) {
					gugudan[i][j]=i*j;
				}
			}
					
			// 추가적으로 while문 무한루프에 빠져나오는 센스있는 코드 있으면 좋다.
			System.out.println("continue?");
			if(sc.next().equals("no")==true) break;
		}
		for(int i=1; i<gugudan.length; i++) {
			for(int j=1; j<gugudan[i].length; j++) {
				System.out.printf("%d * %d= %d%n",i, j, gugudan[i][j]);
			}
		}
	}

}