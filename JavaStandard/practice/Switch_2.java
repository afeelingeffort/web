import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("월을 입력해주세요.>");
		month=scan.nextInt();
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지입니다.");
			break;
		case 4: case 6: case 11:
			System.out.println("30일까지입니다.");
			break;
		default:
			System.out.println("28일까지입니다.");
			break;
		}
	}

}
