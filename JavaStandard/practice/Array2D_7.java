
public class Array2D_7 {

	public static void main(String[] args) {
		int[][] arr= {
				{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}
		};
		
		System.out.println("배열의 열의 길이: "+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"행의 길이 : "+arr[i].length);
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
