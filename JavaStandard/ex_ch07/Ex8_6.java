
public class Ex8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e=new Exception("고의로 발생시켰음.");
			throw e;
		}
		catch(Exception e) {
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
