

/*
2. 1~9단 2차원 배열에 저장하기
이중 for문, 2차원 배열
1 1 1
1 2 2
1 3 3
. . .
9 9 81
*/

public class TestProject_12_while_arr
{
	public static void main(String[] args)
	{
		int[][] gugudan=new int[10][10];
		
		for(int i=1; i<gugudan.length; i++)
		{
			for(int j=1; j<gugudan[i].length; j++)
			{
				gugudan[i][j]=i*j; // 2차원 배열에 값을 넣는 방법을 모른다.
				// System.out.println(i + " " + j + " " + i*j);
			}
		}
		
		// 저장된 구구단 데이터를 출력함.
		for(int i=1; i<gugudan.length; i++) {
			for(int j=1; j<gugudan[i].length; j++) {
				System.out.printf("%d*%d=%d ", i, j, gugudan[i][j]);
			}
			System.out.println();
		}
	}
}
