/*
3 6 9 12 ... 99
5, 10, 15, 20 ... 95
7, 14, ... , 98
9, ... 99
*/
public class TestProejct_23 {

	public static void main(String[] args) {
		
		int numRow=4;
		int numCol=100;
		int[][] arr = new int[numRow][numCol];
		
		int j=3;	// j의 값을 3으로 초기화 한다. 
		for(int n=0; n<numRow; n++) {	//n의 초깃값이 0이고 n이 numRow보다 작을 때 n++한다.
			for(int k=0; k<numCol; k++) {	//k의 초깃값이 0이고 k가 numCol보다 작을 때 k++한다
				if((k>1)&&(k%j==0)) arr[n][k] = k;	//만약 k가 1보다 크거나 k%j가 0이면 arr[n][k]에 k값을 저장한다.
				else				continue;	//위 조건식이 일치하지 않으면 continue 한다. 
			}
			j+=2;	//j의 값이 2씩 증가되어 j에 저장한다.
		}
		
		for(int n=0; n<numRow; n++) {	
			for(int k=0; k<numCol; k++) {
				//만약 arr[n][k]가 0이 아니면 arr[n][k]를 출력한다. 
				if(arr[n][k]!=0) System.out.printf("%d ", arr[n][k]);	
			}
			System.out.printf("\n");
		}
		
		
		
		/*
		int[][] arr = new int[4][100];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i * j < 100) {
					if (j % 3 != 0)
						continue;
					else if (j % 5 != 0)
						continue;
					else if (j % 7 != 0)
						continue;
					else if (j % 9 != 0)
						continue;
				}
				arr[i][j]=i*j;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.printf("%n");
		}
		*/
	}

}
