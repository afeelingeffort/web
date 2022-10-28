
public class Array_12 {

	public static void main(String[] args) {
		int[] num=new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i]=i;
			System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n=(int)(Math.random()*10);
			int temp=num[0];
			num[0]=num[n];
			num[n]=temp;
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
