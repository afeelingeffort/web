public class Array_1
{
	public static void main(String[] args)
	{
		int[][] a = new int[][]{{5, 8, 10, 6, 4},{11, 20, 1, 3, 2},{7, 9, 14, 22, 3}};
		int i, j;

		for( i=0; i<a.length; i++)
		{
			for( j=0; j<a[i].length; j++)
			{
				System.out.printf("%2d   ", a[i][j]);
			}

			System.out.println();
		}
	}