
public class Operator_2 {

	public static void main(String[] args) {
		String str1="짝수입니다.";
		String str2="홀수입니다.";
		int i=2;
		
		String str3=(i%2==0)?str1:str2;
		System.out.println(str3);
		
		//삼항 연산자로 최댓값 구하기
		int a=3;
		int b=2;
		
		int i2=(a>b)?a:b;
		System.out.println(i2);
		
		//삼항 연산자로 최솟값 구하기
		int a2=1;
		int b2=2;
		
		int i3=(a2<b2)?a2:b2;
		System.out.println(i3);
	}

}
