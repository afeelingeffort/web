// main에서 price 값을 전달해서 저장할 수 있는 메서드를 만들기. 전달은 main 저장은 메서드
class computer {
	private String company;
	private int price;

	computer() {

	}

	computer(String a, int b) {
		this.company = a;
		this.price = b;
	}

	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
}

public class TestProject_17_oop {

	public static void main(String[] args) {
		computer cmp = new computer();
		computer cmp2 = new computer("Samsung", 1000000);
		
		System.out.println(cmp2.getPrice());
		
		cmp.setPrice(1100000);
		System.out.println(cmp.getPrice());
	}

}
