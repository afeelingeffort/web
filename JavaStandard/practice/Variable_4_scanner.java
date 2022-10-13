import java.util.Scanner;

public class Variable_4_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		String name = "";
		String x,y = "";
		
		//nextInt()와 nextLine()
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt(); // 정수를 입력받음
		System.out.print("이름을 입력하세요 : ");
		name = sc.next(); // 공백 전 까지 입력 받음
		System.out.printf("나이 : %d  이름 : %s%n%n",age, name);
		
		// next() 와 nextLine()의 차이점
		System.out.print("a b c d 입력 : ");
		y = sc.nextLine();
		x = sc.next();	
		 // 한 줄 전체를 입력받음 
		System.out.printf("x = %s%ny = %s",x,y);
		//System.out.printf("x = %s %ny = %s %n",x, y);
		
	}
	

}
