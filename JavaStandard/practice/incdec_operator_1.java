
public class incdec_operator_1 {

	public static void main(String[] args) {
		int num1 = 7, num2 = 7;
		int result1, result2;
		
		result1=--num1+4;
		result2=num2--+4;
		
		System.out.println("전위 감소 연산자에 의한 결과 : "+result1+", 변수의 값 : "+num1);
		System.out.println("후위 감소 연산자에 의한 결과 : "+result2+", 변수의 값 : "+num2);
	}

}

/*위의 예제에서 첫 번째 연산은 변수 num1의 값을 먼저 1 감소시킨 후에 나머지 연산을 수행합니다.

하지만 두 번째 연산에서는 먼저 모든 연산을 마친 후에 변수 num2의 값을 1 감소시킵니다.

따라서 변수 num2의 감소 연산자는 전체 연산에 어떠한 영향도 미치지 않습니다.*/