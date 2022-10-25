import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[100];
		int i, cnt = 0;

		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

			if (arr[i] == 0) {
				break;
			}

			cnt++;
		}

		for (i = 0; i < cnt; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}

}

/*최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성 */