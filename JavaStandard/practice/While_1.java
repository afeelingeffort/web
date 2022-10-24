/*
1부터 100까지의 수 중에서 짝수의 합과 홀수의 합을 모두 출력한다.
짝수의 합은 evenSum에 홀수의 합은 oddSum에 출력
*/
public class While_1 {

	public static void main(String[] args) {
		int i=1;
		int evenSum=0;
		int oddSum=0;
		
		while(i<=100) {
			if(i%2==0) {
				evenSum+=i;
			}else if(i%2==1) {
				oddSum+=i;
			}
			i++;
		}
		System.out.println("짝수의 합: "+evenSum);
		System.out.println("홀수의 합: "+oddSum);
	}

}
