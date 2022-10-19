class Student2 {
	String name;
	int age;
	double height;

	Student2(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	void PrintStudentInfo() {
		System.out.println("이름 : " + name + " ");
		System.out.println("나이 : " + age + " ");
		System.out.println("몸무게 : " + height + " ");
	}
}

public class Oop_11_array {

	public static void main(String[] args) {
		Student2[] std2 = new Student2[3];
		String[] namelist = { "Tom", "Harry", "Alice" };
		int[] agelist = { 18, 19, 17 };
		double[] heightlist = { 66.6, 74.3, 55.2 };

		for (int i = 0; i < std2.length; i++) {
			std2[i] = new Student2(namelist[i], agelist[i], heightlist[i]);
		}

		for (int i = 0; i < std2.length; i++) {
			std2[i].PrintStudentInfo();
		}
	}

}