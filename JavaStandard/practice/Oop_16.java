import java.util.Scanner;

class classtest{
	String name;
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Oop_16 {

	public static void main(String[] args) {
		classtest ct=new classtest();
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		String n=sc.nextLine();
		System.out.print("나이 : ");
		int a=sc.nextInt();
		ct.setName(n);
		ct.setAge(a);
		System.out.println("안녕하세요. "+ct.getName()+" 님");
		System.out.println("당신의 나이는 "+ct.getAge()+" 입니다.");
	}

}
