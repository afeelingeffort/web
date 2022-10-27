/*
1 4 7
2 5 8 
3 6 9 출력하기
*/
public class Array2D_13 {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		int cnt=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=cnt;
				cnt=cnt+3;
			}
			cnt=cnt-8;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
