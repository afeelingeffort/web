interface Calc{
	double PI=3.14;
	int Error=-9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}

class completeCalc implements Calc{
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
	public int times(int num1, int num2) {
		return num1*num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return Calc.Error;
		}
	}
}

public class interface_2 {

	public static void main(String[] args) {
		Calc calc=new completeCalc();
		System.out.print(calc.add(3, 9));
	}

}
