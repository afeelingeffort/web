class ParentBook{
	String name;
	int price;
	
	public void Print() {
		System.out.println("책의 이름과 가격 : "+name+" "+price);
	}
}

class ChildBook extends ParentBook{
	ChildBook(String name, int price){
		this.name=name;
		this.price=price;
	}
	
}
public class Extends_5 {

	public static void main(String[] args) {
		ChildBook cb=new ChildBook("강아지똥", 10000);
		cb.Print();
	}

}
