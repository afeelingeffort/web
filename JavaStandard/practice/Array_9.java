
public class Array_9 {

	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50, -2};
		
		for(int i=0; i<arr.length; i++) {
			if(i==3) {
				continue;
			}
			
			System.out.println("arr["+i+"]: "+arr[i]);
		}
	}

}
