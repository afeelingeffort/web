//참조형 매개변수
class Data2{
	int x;
}

public class Oop_13 {

	public static void main(String[] args) {
		Data2 d=new Data2();
		d.x=10;
		System.out.println("x="+d.x);
		
		change(d); //객체 주소를 전달
		System.out.println("After change(d) \n x="+d.x); //값이 공유되어 x=100이 됨.
	}
	static void change(Data2 d) {
		d.x=100;
		System.out.println("change() 메소드 호출 후 : x="+d.x);
	}

}
