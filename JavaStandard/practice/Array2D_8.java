
public class Array2D_8 {

	public static void main(String[] args) {
		int[][] arr= new int[5][5];
		
		int k=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

}
