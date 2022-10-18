class smartphone2 {
	// smartphone의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int brightness; // 화면 밝기

	// smartphone의 기능(메서드)
	void power() {
		power = !power;
	} // smartphone을 켜거나 끄는 메서드

	void brightnessUp() {
		++brightness;
	} // smartphone의 화면 밝기를 높이는 메서드

	void brightnessDown() {
		--brightness;
	}
	// smartphone의 화면 밝기를 낮추는 메서드
}

public class Oop_2 {
	public static void main(String[] args) {
		smartphone2[] smartphoneArr = new smartphone2[3]; // 길이가 3인 객체 배열

		// 스마트폰 객체를 생성해서 스마트폰 배열의 각 요소에 저장
		for (int i = 0; i < smartphoneArr.length; i++) {
			smartphoneArr[i] = new smartphone2();
			smartphoneArr[i].brightness = i + 10; // smartphoneArr[i]의 brightness에 i+10을 저장
		}
		
		for (int i = 0; i < smartphoneArr.length; i++) {
			smartphoneArr[i].brightnessUp(); // smartphoneArr[i]의 메서드 호출, 밝기 1 증가
			System.out.printf("smartphoneArr[%d].brightness=%d%n", i, smartphoneArr[i].brightness);
		}
	}
}
