
public class Array_8 {

	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 50, 3, -2, 6};
		
		int sum=0;
		double avg=0.0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		avg=sum/arr.length;
		System.out.println("총합: "+sum+", 평균: "+avg);
	}

}
// 배열안의 모든 값을 더하고 총합과 평균 출력하기. 