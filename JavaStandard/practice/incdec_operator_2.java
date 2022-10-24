
public class incdec_operator_2 {

	public static void main(String[] args) {
		int ia=10, ib=10, ix, iy;
		
		ia++;
		++ib;
		System.out.println("ia:"+ia+", ib:"+ib);
		
		ix=--ia;
		iy=ib--;
		System.out.println("ia:"+ia+", ib:"+ib);
		System.out.println("ix:"+ix+", iy:"+iy);
	}

}
