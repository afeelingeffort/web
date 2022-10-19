class Car {
	String color;
	String model;
	int power;
	int carSpeed;

	public Car() {
		carSpeed = 0;
	}

	public Car(String color, String model, int power) {
		this.color = color;
		this.model = model;
		this.power = power;
	}

	public void go() {
		if (power < 200) {
			carSpeed += 10;
		} else if (power >= 200) {
			carSpeed += 20;
		}
		System.out.printf("Accelerate %s, Current Speed %d%n", model, carSpeed);
	}

	public void stop() {
		carSpeed = 0;
	}
}

public class Oop_7_method {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("red", "sonata", 100);
		
		System.out.println(c2);
	}

}