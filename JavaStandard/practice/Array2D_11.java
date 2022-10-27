
public class Array2D_11 {

	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		
		int cnt=21;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=cnt;
				cnt=cnt+1;
			}
			cnt=cnt-10;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
