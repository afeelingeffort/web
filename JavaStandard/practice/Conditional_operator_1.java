
public class Conditional_operator_1 {

	public static void main(String[] args) {
		int a;
		if (5 < 4) {
			a = 50;
		} else {
			a = 40;
		}
		System.out.println(a);

		int b = (5 < 4) ? 50 : 40;
		System.out.println(b);
	}

}
