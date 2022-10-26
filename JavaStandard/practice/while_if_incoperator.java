
public class while_if_incoperator {

	public static void main(String[] args) {
		int count = 0;
		int numCount = 0;

		while (true) {
			System.out.printf("%d ", (count++) % 10);

			if (count % 10 == 0) {
				numCount++;
				System.out.print("\n");
			}

			if (numCount == 10)
				break;
		}

		return;
	}
}
