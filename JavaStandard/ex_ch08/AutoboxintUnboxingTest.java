import java.util.ArrayList;

public class AutoboxingUnboxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();	//Array클래스가 객체만 저장 가능
		list.add(new Integer(100));
		list.add(100);
		
//		Integer i=list.get(0);
//		int i=list.get(0).intValue();
		int i=list.get(0);
	}

}
