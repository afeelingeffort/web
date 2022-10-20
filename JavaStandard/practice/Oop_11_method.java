class Calculator{
	void powerOn() {
		System.out.println("전원 on");
	}
	
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result=x/y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 off");
	}
}
public class Oop_11_method {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.powerOn();
		
		int result1=calc.plus(10,5);
		System.out.println("result1: "+result1);
		
		double result2=calc.divide(10, 5);
		System.out.println("result2: "+result2);
		
		calc.powerOff();
	}

}