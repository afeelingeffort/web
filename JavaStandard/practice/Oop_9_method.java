class stat {
	private int power;
	private int dex;
	private int intel;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power < 0) {
			this.power = 0;
		} else {
			this.power = power;
		}
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		if (dex < 0) {
			this.dex = 0;
		} else {
			this.dex = dex;
		}
	}

	public int getInt() {
		return intel;
	}

	public void setIntel(int intel) {
		if (intel < 0) {
			this.intel = 0;
		} else {
			this.intel = intel;
		}
	}
}

public class Oop_9_method {

	public static void main(String[] args) {
		stat character=new stat();
		
		character.setPower(99);
		character.setDex(99);
		character.setIntel(99);
		
		System.out.println("힘 능력치: "+character.getPower());
		System.out.println("민첩 능력치: "+character.getDex());
		System.out.println("지능 능력치: "+character.getInt());
	}

}