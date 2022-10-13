import java.util.Scanner;

public class TestProject_9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		while(true)
		{
			System.out.println("숫자를 입력하세요.");
			int num1=scanner.nextInt();
					
			
			if(num1%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
			
			System.out.println("월을 입력하세요.");
			int num2=scanner.nextInt();
			int result=num2;
			
			switch(result) {
				case 3: case 4: case 5:
					System.out.println("지금은 봄입니다.");
				break;
				case 6: case 7: case 8:
					System.out.println("지금은 여름입니다.");
				break;
				case 9: case 10: case 11:
					System.out.println("지금은 가을입니다.");
				break;
				case 12:case 1: case 2:
					System.out.println("지금은 겨울입니다.");
				break;
				default:
				break;
			}
			
			System.out.println("continue??");
			if((scanner.next()).equals("no")==true) break;
		}
	}

}
