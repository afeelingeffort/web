
public class Array_14 {

	public static void main(String[] args) {
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < number.length; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지 체크

			for (int j = 0; j < number.length - 1 - i; j++) {
				if (number[j] > number[j + 1]) {
					int tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로
				}
			}

			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어난다.

			for (int k = 0; k < number.length; k++) {
				System.out.print(number[k]);
			}
			System.out.println();
		}
	}

}
