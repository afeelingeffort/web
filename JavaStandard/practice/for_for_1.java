
public class for_for_1 {

	public static void main(String[] args) {
		for(int k=2; k<=9; k++) {
			System.out.print("*** "+k+"단 ***\t");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %2d\t", j,i, j*i);
			}
			System.out.println();
		}
	}

}
