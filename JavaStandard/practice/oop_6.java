class Print{
	public static void printArr() {
		System.out.println();
	}
	
	public static void printArr(int[] arr) {
		for(int a: arr) {
			System.out.println(a);
		}
	}
	
	public static void printArr(String[] strs) {
		for(String s: strs) {
			System.out.println(s);
		}
	}
	
	public static void printArr(double[] doubles) {
		for(double d: doubles) {
			System.out.println(d);
		}
	}
}

public class oop_6 {

	public static void main(String[] args) {
		int[] scores= {100, 13, 44};
		String[] name= {"짱구", "철수", "맹구"};
		double[] doubles= {1.1, 2.2, 3.3};
		
		
		Print.printArr(scores);
		Print.printArr();
		Print.printArr(name);
		Print.printArr();
		Print.printArr(doubles);
	}

}
