class Carrr{
	protected int num;
	protected double gas;
	
	public Carrr() {
		num=0;
		gas=0.0;
		System.out.println("자동차가 생성되었습니다.");
	}
	
	public void setCar(int num, double gas) {
		this.num=num;
		this.gas=gas;
		System.out.println("차량 번호를 "+num+"으로, 연료양을 "+gas+"로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량번호는 "+num+"입니다.");
		System.out.println("연료양은 "+gas+"입니다.");
	}
	
}

class RacingCar extends Carrr{
	private int course;
	
	public RacingCar() {
		course=0;
		System.out.println("레이싱카가 생성되었습니다.");
	}
	
	public void setRacingCar(int course) {
		this.course=course;
		System.out.println("코스 번호는 "+course+"입니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 "+num+"입니다.");
		System.out.println("연료양은 "+gas+"입니다.");
		System.out.println("코스 번호는 "+course+"입니다.");
	}
}
public class Extends_4 {

	public static void main(String[] args) {
		Carrr c=new Carrr();
		c.setCar(3, 10.5);
		c.show();
	}

}
