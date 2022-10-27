class SalaryMan{
	int salary;
	
	SalaryMan(){
		this.salary=1000000;
	}
	SalaryMan(int salary){
		this.salary=salary;
	}
	public int getAnnualGross() {	//연봉 월*12 
		//보너스 500%를 수령해야 하니 5.0을 곱해야하지만 정수형이므로 5만 곱함.
		return (this.salary*12)+(this.salary*5);	//연봉 + 500% 보너스 수령
	}
	
}

public class oop_9 {

	public static void main(String[] args) {
		SalaryMan sm=new SalaryMan();
		sm.salary=1500000;
		//연봉 1800만 * 보너스 750만
		System.out.println(sm.getAnnualGross());
		System.out.println();
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
