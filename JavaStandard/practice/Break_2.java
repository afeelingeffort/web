
public class Break_2 {

	public static void main(String[] args) {
		int sum=0;
		int num=1;
		
		while(true) {
			sum+=num;
			if(sum>100) 
				break;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
