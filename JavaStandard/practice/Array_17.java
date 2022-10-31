import java.util.Arrays;

public class Array_17 {

	public static void main(String[] args) {
		int ar1[];
		ar1=new int[] {1,2,3};
		
		int[] ar2= {2,3,4};
		int[] ar3=new int[5];
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println(ar1);
		System.out.println(Arrays.toString(ar2));
		System.out.println(Arrays.toString(ar3));
	}

}
