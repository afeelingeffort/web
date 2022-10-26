import java.util.Scanner;

public class flowchartTest_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		double distance=0;
		
		System.out.print("이동 거리를 입력해주세요.>");
		distance=scn.nextDouble();
		
		if(distance<5) {
			System.out.print("1000원");
		} else if(distance>=5||distance<10) {
			System.out.print("2000원");
		} else if(distance>=10) {
			System.out.print("3000원");
		}
	}

}
