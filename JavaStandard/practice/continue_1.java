public class continue_1 {

	public static void main(String[] args) {
		// 3의배수만 출력하자
		
		
		
		for(int i = 1; i < 100; i++) {
			
			if(i %3 != 0) {
				continue;
			}
			System.out.println(i);
		}