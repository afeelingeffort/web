
/*
2. 1~9단 2차원 배열에 저장하기
이중 for문, 2차원 배열
1 1 1
1 2 2
1 3 3
. . .
9 9 81
*/

// 문제의 결과를 제대로 못 읽었다.
public class TestProject_11_array
{
	public static void main(String[] args)
	{
		int[][] gugudan=new int[10][10];
		
		for(int i=1; i<gugudan.length; i++)
		{
			for(int j=1; j<gugudan[i].length; j++)
			{
				gugudan[i][j]=i*j;
				// System.out.println(i + " " + j + " " + i*j);
				// 문제의 결과를 제대로 못 읽어 이상한 조건문을 넣고 있었다.
				
			}
		}
		
		for(int i=1; i<gugudan.length; i++) {
			for(int j=1; j<gugudan[i].length; j++) {
				System.out.printf("%d*%d=%d ", i, j, gugudan[i][j]);
			}
			System.out.println();
		}
	}
}
