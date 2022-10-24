
public class If_If_1 {

	public static void main(String[] args) {
		int yourMoney=10000;
		
		String dessert="";
		
		if(yourMoney>5000) {
			if(yourMoney>7000) {
				dessert="cake and coffe";
			}else {
				dessert="coffee";
			}
		}
		
		System.out.println(dessert);
	}

}
