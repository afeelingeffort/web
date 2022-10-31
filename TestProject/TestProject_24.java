
class Lotto {
	String name;
	private int[] autoNum;
	private int[] manualNum;
	private int price = 3000;
	private int userMoney;

	Lotto() {
	};

	Lotto(String name) {
		this.name = name;
	};

	public int[] getautoNum() {
		return autoNum;
	}

	public void setautoNum(int[] autoNum) 
	{

		for (int i = 0; i < autoNum.length; i++) {
			autoNum[i] = (int) (Math.random() * 50) + 1;
		}

//		int tmp;
//		int j;
//		for (int i = 0; i < 100; i++) {
//			j = (int) (Math.random() * 50);
//			tmp = autoNum[0];
//			autoNum[0] = autoNum[j];
//			autoNum[j] = tmp;
//		}

		for (int i = 0; i < 6; i++) {
			System.out.print(autoNum[i] + " ");
		}
	}

}

public class TestProject_24 {

	public static void main(String[] args) {
		Lotto lt = new Lotto("강민정");
		Lotto lt2 = new Lotto();

		System.out.println(lt.name + "님의 로또 번호는 " + lt2.setautoNum() + " 입니다.");
	}

}