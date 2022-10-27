import java.util.Scanner;

class StudentEx1{
	private String name;
	private int id;
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return this.name+"학과";
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	int getId() {
		return this.id;
	}
}
public class oop_8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		StudentEx1 std=new StudentEx1();
		
		System.out.println("---- 회원가입 ----");
		System.out.print("학과 입력: ");
		String name=scn.next();
		std.setName(name);
		
		System.out.print("학번 입력 : ");
		int id=scn.nextInt();
		std.setId(id);
		
		System.out.println("학생의 학과 : "+std.getName()+", 학번 : "+std.getId());
	}

}