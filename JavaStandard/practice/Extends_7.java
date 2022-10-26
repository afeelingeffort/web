class Person{
	protected String name;
	protected int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String toString() {
		return "Person [name="+name+", age"+age+"]";
	}
	
}

class Studentt extends Person{
	
	public Studentt(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String toString() {
		return "Student [name="+name+", age="+age+"]";
	}
}
public class Extends_7 {

	public static void main(String[] args) {
		Studentt s=new Studentt("홍길동", 30);
		System.out.println(s);
	}

}
