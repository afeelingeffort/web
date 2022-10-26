class Tea extends CaffeineBeverage{
	void prepareRecipe() {
		boilWater();
		pourInCup();
	}
	
	public void brew() {
		System.out.println("티백을 담근다.");
	}
	
	public void addCondiments() {
		System.out.println("레몬을 추가한다.");
	}
}


class Coffee extends CaffeineBeverage{
	void prepareRecipe() {
		boilWater();
		pourInCup();
	}
	
	public void brew() {
		System.out.println("필터를 활용해 커피를 내린다.");
	}
	
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가한다.");
	}
	
}

abstract class CaffeineBeverage{
	abstract void brew();
	abstract void addCondiments();
	
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	protected void boilWater() {
		System.out.println("물을 끓인다.");
	}
	
	protected void pourInCup() {
		System.out.println("컵에 붓는다.");
	}
}


public class interface_1 {

	public static void main(String[] args) {
		
	}

}