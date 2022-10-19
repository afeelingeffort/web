class Car2 {
	private int fuel = 0;
	
	Car2(){
		
	}
	
	void set(int input1) {
		if (input1 < 10) {
			System.out.println("input1 value less than 10");
		} else {
			fuel = input1;
		}
	}

	int get() {
		return fuel;
	}
}

public class Oop_8_method {

	public static void main(String[] args) {
		Car2 car2=new Car2();
		
		car2.set(15);
		System.out.println(car2.get());
		
		car2.set(8);
		System.out.println(car2.get());
		
		Car2 c2=new Car2();
		// c2.fuel=3;
		// System.out.println(c2);
	}

}