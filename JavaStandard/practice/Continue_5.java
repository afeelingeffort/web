
public class Continue_5 {

	public static void main(String[] args) {
		int total=0;
		int num;
		
		for(num=1; num<=100; num++) {
			if((num%2)==0) {
				continue;
			}
			total+=num;
		}
		System.out.println(total);
	}

}
