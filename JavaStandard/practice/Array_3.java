import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int[] arr= new int[5];
		int i;
		
		for(i=0; i<5; i++) {
			arr[i]=scn.nextInt();
			System.out.print(arr[i]+" ");
		}
	}

}
