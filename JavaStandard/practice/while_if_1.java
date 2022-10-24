
public class while_if_1 {

	public static void main(String[] args) {
		int i = 2;
		int sum = 1;

		while (i <= 100) {
			sum += i;
			boolean iBool = sum > 55;
			if (iBool) {
				sum = sum - i;
				break;
			} else {
				System.out.println("1부터 " + i + "까지의 합>" + sum);
			}
			i++;
		}
		System.out.println("1부터 10까지의 합>" + sum);
	}

}
