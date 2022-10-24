
public class Conditional_operator_2 {

	public static void main(String[] args) {
		String grade = "";
		int math = 70;

		if (math >= 90)
			grade = "pass";
		else
			grade = "fail";
		System.out.println(math + " is " + grade);

		String grade2 = (math >= 90) ? "pass" : "fail";
		System.out.println(math + " is " + grade2);
	}

}
