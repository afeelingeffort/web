import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		
		int age=scanner.nextInt();// 정수를 입력받아 변수 age에 저장. 
		int charge=0;
		
		if(age<8) {
			charge=1000;
		} else if(age<14) {
			charge=1500;
		} else if(age<20) {
			charge=2000;
		} else {
			charge=3000;
		}
		
		System.out.println("나이 : "+age);
		System.out.println("요금 : "+charge);
		
	}
}