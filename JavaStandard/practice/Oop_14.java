class Car3{
	private int speed;
	private boolean stop=false;
	
	Car3(){}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}
		else {
			this.speed=speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop=stop;
		if(stop) {
			this.speed=0;
			System.out.println("자동차 멈춤");
		}
	}
}
public class Oop_14 {

	public static void main(String[] args) {
		Car3 car=new Car3();
		
		car.setSpeed(-100);
		System.out.println("현재 속도 : "+car.getSpeed());
		car.setSpeed(100);
		System.out.println("현재 속도 : "+car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
	}

}
