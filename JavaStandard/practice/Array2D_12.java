/*
1 2 3 
4 5 6
7 8 9 출력하기 
*/
public class Array2D_12 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=cnt;
				cnt=cnt+1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
