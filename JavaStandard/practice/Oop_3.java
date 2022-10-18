class Magician {
	// 마법사의 속성(멤버변수)
	String hair; // 머리 색상
	int level; // 레벨
	int energy; // 체력

	// 마법사의 기능(메서드)
	void healing() {
		++energy;
	} // 체력회복 기술을 쓰는 메서드
}

class Oop_3 {
	public static void main(String args[]) {
		Magician mg = new Magician(); // Magician인스턴스를 생성한다.
		mg.level = 9; // 멤버변수 level값을 9로 한다.
		mg.energy = 0;
		System.out.println("현재 캐릭터의 레벨은 " + mg.level + "입니다."); // 현재 캐릭터의 레벨은 9입니다.
		System.out.println("현재 캐릭터의 체력은 " + mg.energy + "입니다."); // 현재 캐릭터의 체력은 0입니다. 
		
		mg.healing();
		System.out.println("현재 캐릭터의 체력은 " + mg.energy + "입니다.");
	}
}