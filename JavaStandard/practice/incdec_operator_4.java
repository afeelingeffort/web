
public class incdec_operator_4 {

	public static void main(String[] args) {
		int cnt=0;
		
		System.out.println(++cnt);
		System.out.println(cnt++);
		System.out.println(++cnt);
		System.out.println(--cnt);
		System.out.println(cnt--);
		System.out.println(++cnt);
		System.out.println(++cnt);
		System.out.println(--cnt);
		System.out.println(--cnt);	//1
		System.out.println(cnt++);	//1
		System.out.println(cnt--);	//2
		System.out.println(cnt++);	//1
		
	}

}
