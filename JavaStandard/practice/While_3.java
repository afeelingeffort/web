
public class While_3 {

	public static void main(String[] args) {
		// while문을 이용하여 짝수단만 구구단으로 출력하기.
		int dan = 2;
		int times = 1;

		while (dan <= 9) {
			if ((dan % 2) != 0) {
				dan++;
				continue;
			}
			times = 1;
			while (times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
