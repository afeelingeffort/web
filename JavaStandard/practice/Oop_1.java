class smartphone {
	// 스마트폰의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int brightness; // 화면 밝기

	// smartphone의 기능(메서드)
	void power() {
		power = !power;
	} 

	void brightnessUp() {
		++brightness;
	} 

	void brightnessDown() {
		--brightness;
	} 
}

public class Oop_1 {
	public static void main(String[] args) {
		smartphone s1 = new smartphone();
		smartphone s2 = new smartphone();
		
		System.out.println("s1의 brightness값은 " + s1.brightness + "입니다.");
		System.out.println("s2의 brightness값은 " + s2.brightness + "입니다.");

		s1.brightness = 10;
		System.out.println("s1의 brightness값을 10으로 변경하였습니다.");

		System.out.println("s1의 brightness값은 " + s1.brightness + "입니다.");
		System.out.println("s2의 brightness값은 " + s2.brightness + "입니다.");
	}
}
