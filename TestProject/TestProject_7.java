//
//
//class Tv2{
//	private int cnt=0;
//	
//	int getCnt() {
//		return this.cnt;
//	}
//	void addCnt() {
//		cnt++;
//	}
//}
//
//class SmartTv extends Tv2{
//	int getCnt() {
//		return super.getCnt();
//	}
//	
////	void addCnt() {
////		super.addCnt();
////	}
//	
//	int addCnt(int cnt) {
//		return cnt++;
//	}
//	
//}
//public class TestProject_7 {
//
//	public static void main(String[] args) {
//		SmartTv stv=new SmartTv();
//		System.out.println(stv.getCnt());
//		
//		for(int cnt=0;cnt<=10;cnt++) {
//			System.out.println(stv.addCnt(cnt));
//		}
//	}
//}
/* --------------------------------------------------- */

class Tv3{
	private int cnt =1;
	
	int getCnt() {
		return cnt;
	}
	void addCnt() {
		cnt++;
	}
	void setCnt(int cnt) {
		this.cnt = cnt;
	}
}

class SmartTv3 extends Tv3 {
	int getCnt() {
		return super.getCnt();
	}
	
	void addCnt() {
		super.addCnt();
	}
	void setCnt(int cnt) {
		super.setCnt(cnt);
	}
}

public class TestProject_7 {
	public static void main(String[] arg) {
		SmartTv3 tv3 = new SmartTv3();
		
		int limit = 10;
		for(int n=0; n<limit; n++) {
			tv3.addCnt();
		}
		System.out.println("result : " + tv3.getCnt());
	}
}