
public class break_1 {

	public static void main(String[] args) {
		int i=1;
		boolean search=false;
		
		while(i<100) {
			if(i%5==0 && i%7==0) {//5와 7의 공배수를 찾음
				search=true;
				break;
			}
			i++;
		}
		
		if(search) {
			System.out.println("찾는 정수 : "+i);
		} else {
			System.out.println("찾지 못했습니다.");
		}
		
	}

}
