
public class Continue_4 {

	public static void main(String[] args) {
		int num;
		
		for(num=1; num<=100; num++) {
			if(num%3!=0) {
				continue;
			}
			System.out.println("3의 배수 : "+num);
		}
	}

}
