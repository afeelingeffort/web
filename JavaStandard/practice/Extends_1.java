class Beer {
	private String type;
	private String model;

	public Beer(String type, String model) {
		this.type = type;
		this.model = model;
	}

	public void drink() {
		System.out.println("마십니다.");
	}

	public void mix() {
		System.out.println("섞습니다.");
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

}

class Hoegaarden extends Beer {
	String flavor;
	int ABV = 6;
	String model;

	Hoegaarden(String model, String flavor) {
		super("밀맥주", model);
		this.model = model;
		this.flavor = flavor;
	}

	Hoegaarden(String model, String flavor, int ABV) {
		super("밀맥주", model);
		this.model = model;
		this.flavor = flavor;
		this.ABV = ABV;
	}

	public void flavorDrink() {
		System.out.println(model + "맥주의 " + flavor + "맛을 마십니다.");
	}

	public String getFlavor() {
		return flavor;
	}

	public int getABV() {
		return ABV;
	}
}

public class Extends_1 {

	public static void main(String[] args) {
		Hoegaarden hgd = new Hoegaarden("호가든", "레몬", 3);

		System.out.println("타입 : " + hgd.getType());
		System.out.println("알콜 도수 : " + hgd.getABV());
		System.out.println("맛 : " + hgd.getFlavor());

		hgd.flavorDrink();
	}

}