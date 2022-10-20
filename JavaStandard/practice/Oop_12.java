//기본형 매개변수
class ValueMethod{
	int i;
	void change(int x) {
		x=99;
	}
	
}
public class Oop_12 {

	public static void main(String[] args) {
		ValueMethod vm=new ValueMethod();
		
		int x=8;
		System.out.println("메소드 호출전 x->"+x);
		
		vm.change(x);
		System.out.println("메소드 호출후 x->"+x);
	}

}
