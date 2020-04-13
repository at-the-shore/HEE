package lotteria;

import java.util.ArrayList;

public class Order {

	ArrayList<MainMenu> mainMenuList;
	ArrayList<DrinkMenu> drinkMenuList;
	
		
	public Order() {  // �⺻������ 
		
	}
	
	public Order(ArrayList<MainMenu> main1, ArrayList<DrinkMenu> drink1) {
		this.mainMenuList = main1;
		this.drinkMenuList = drink1;
	}
	
	public String order() { 	// �Է� ���� �޴����� ���� �� ������ ����� �޼ҵ� 
		int totalmain= 0;  // �ܹ����� �� ������ ���� ���� totalburger 0���� �ʱ�ȭ 
		for (int i = 0; i < mainMenuList.size(); i++) { //burger1����Ʈ�� �����ŭ �ݺ����� ���� 
			totalmain = totalmain + mainMenuList.get(i).price; 
			// burger1�� ? ? ?
		}
			
		int totaldrink = 0;
//		System.out.println(drinkMenuList.size());
//		System.out.println(drinkMenuList);
		for (DrinkMenu drink : drinkMenuList) {  
			totaldrink = totaldrink + drink.price;
		}
		
		int totalPrice = totalmain + totaldrink;

		return "�� ������ " + totalPrice + "�� �Դϴ�.";
	}	
}
