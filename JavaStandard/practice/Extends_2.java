class Phone {
	String name = "핸드폰";

	public void function() {
		System.out.println("은 지문인식 기능을 가지고 있다.");
	}
	
	public void print() {
		System.out.print(name);
		function();
	}
}

class Iphone extends Phone{
	public Iphone(String name) {
		this.name=name;
	}
	
	public void function() {
		super.function();
		System.out.print("홍채인식 기능을 가지고 있다.\n");
	}
	
}

public class Extends_2 {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.print();
		
		System.out.println();
		
		Phone p1=new Iphone("아이폰");
		p1.print();
		
		System.out.println();
		
		Iphone p2=new Iphone("아이폰2");
		p2.print();
	}

}
