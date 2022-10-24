// 아무 클래스를 상속하게 된다면 부모 클래스의 디폴트 생성자를 우선 호출함.
class Parent{
	int age=45;
	String name="Parent";
	
	public Parent() {
		System.out.println("Parent Default Constructor");
	}
	
	public Parent(int age, String name) {
		this.age=age;
		this.name=name;
		System.out.println("Parent Constructor");
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+", age: "+age);
	}
}

class Child extends Parent{
	public Child(int age, String name) {
		System.out.println("Child Constuctor");
	}
}
public class Extends_3 {

	public static void main(String[] args) {
		Child c=new Child(25, "SHU");
		c.showInfo();
	}

}
