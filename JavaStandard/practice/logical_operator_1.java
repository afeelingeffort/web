
public class logical_operator_1 {

	public static void main(String[] args) {
		if(true&&true) {
			System.out.println(1);
		}
		
		if(true&&false) {
			System.out.println(2);
		}
		
		if(false&&true) {
			System.out.println(3);
		}
		
		if(false&&false) {
			System.out.println(4);
		}
		
		System.out.println("---------------------");
		
		if(true||true) {
			System.out.println(1);
		}
		
		if(true||false) {
			System.out.println(2);
		}
		
		if(false||true) {
			System.out.println(3);
		}
		
		if(false||false) {
			System.out.println(4);
		}
		
		
	}

}