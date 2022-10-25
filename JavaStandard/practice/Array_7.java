import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[10];
		int i, max;

		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		max = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}

}
/*10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램*/