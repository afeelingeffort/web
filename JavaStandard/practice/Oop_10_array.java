class Book2{
	String title;
	int price;
	
	public Book2() {	}
	
	public void showPrice() {
		System.out.println(title+"의 가격은 "+price+"원 입니다.");
	}
}
public class Oop_10_array {

	public static void main(String[] args) {
		Book2[] b=new Book2[3];
		
		for(int i=0;i<b.length;i++) {
			b[i]=new Book2();
		}
		
		b[0].title="국어책";
		b[0].price=3000;
		
		b[1].title="영어책";
		b[1].price=3000;
		
		b[2].title="수학책";
		b[2].price=4000;
		
		for(int i=0;i<b.length;i++) {
			b[i].showPrice();
		}
	}

}