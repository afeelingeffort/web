import java.util.Scanner;

class VendingMachine {
	String[] drink = { "cider", "coke", "hwanta" };
	int[] price = { 1000, 1100, 1200 };
	int userMoney;

	// 0:사이다, 1:콜라, 2:환타
	void selDrink(int drinkbuttonIndex) {
		int cal = this.userMoney - this.price[drinkbuttonIndex];
		if (cal < 0) {
			System.out.println("lack of the money");
		} else {
			/*
			 * if(drinkbuttonIndex==0) { System.out.println("사이다"); }else
			 * if(drinkbuttonIndex==1) { System.out.println("콜라"); }else
			 * if(drinkbuttonIndex==2) { System.out.println("환타"); }
			 */
			System.out.println(drink[drinkbuttonIndex]);
			this.userMoney = cal;

		}
	}

	int getChange() {
		return userMoney; // 거스름돈 반환하기.
	}

	void setUserMoney(int userMoney) {
		this.userMoney += userMoney; // 자판기에 넣은 돈 저장하기.
	}

	String[] getDrinkStr() {
		return this.drink;
	}
}

public class TestProject_18_oop {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Scanner scn = new Scanner(System.in);

		int userMoney;
		int selDrinkIdx;
		while (true) {
			userMoney = 0;
			System.out.print("input userMoney : ");
			userMoney = scn.nextInt();
			vm.setUserMoney(userMoney);

			System.out.print("select drink(0:cider, 1:coke, 2:hwanta) : ");
			selDrinkIdx = scn.nextInt();
			vm.selDrink(selDrinkIdx);
			
			System.out.println(vm.getChange());
			
			System.out.print("continue ?? (y or n) : ");
			if ((scn.next()).equals("n") == true) {
				break;
			}
		}
	}

}
