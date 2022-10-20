//일반형 매개변수
class exMethod2{
	public static void changeValue(String testVal) {
		testVal="change test data";
	}
}
public class Oop_10_method2 {

	public static void main(String[] args) {
	String testVal="test";
	
	System.out.println("일반 변수 형 호출 전 데이터 : "+testVal);
	
	//hangeValue(testVal);
	
	System.out.println("일반 변수 형 호출 후 데이터 : "+testVal);
	}

}
