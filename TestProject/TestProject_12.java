/*
3. 2번에서 사용한 이중for문을 while문으로 바꾸기.
-2차원 배열을 선언하여 구구단 결과 저장하기.
*/
public class TestProject_12 {

	public static void main(String[] args) {
//		for(int i=1; i<gugudan.length; i++)
//		{
//			for(int j=1; j<gugudan[i].length; j++)
//			{
//				gugudan[i][j]=i*j;}

		int[][] gugudan = new int[10][10];

		int i = 1;
		int j = 1;

		while (i < gugudan.length) {
			while (j < gugudan[0].length) {
				gugudan[i][j] = i * j;
				j++;
			}
			i++;
			j=1;
		}
		i = 1;
		while (i < gugudan.length) {
			while (j < gugudan[0].length) {
				System.out.printf("%d*%d=%d ", i, j, gugudan[i][j]);
				j++;
			}
			i++;
			j=1;
			System.out.println();
		}
	}
}