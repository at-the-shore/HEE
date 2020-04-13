package lotteria;

import java.util.ArrayList;

public class Order {

	ArrayList<MainMenu> mainMenuList;
	ArrayList<DrinkMenu> drinkMenuList;
	
		
	public Order() {  // 기본생성자 
		
	}
	
	public Order(ArrayList<MainMenu> main1, ArrayList<DrinkMenu> drink1) {
		this.mainMenuList = main1;
		this.drinkMenuList = drink1;
	}
	
	public String order() { 	// 입력 받은 메뉴들의 가격 총 가격을 계산할 메소드 
		int totalmain= 0;  // 햄버거의 총 가곅을 넣을 변수 totalburger 0으로 초기화 
		for (int i = 0; i < mainMenuList.size(); i++) { //burger1리스트의 사이즈만큼 반복문을 실행 
			totalmain = totalmain + mainMenuList.get(i).price; 
			// burger1의 ? ? ?
		}
			
		int totaldrink = 0;
//		System.out.println(drinkMenuList.size());
//		System.out.println(drinkMenuList);
		for (DrinkMenu drink : drinkMenuList) {  
			totaldrink = totaldrink + drink.price;
		}
		
		int totalPrice = totalmain + totaldrink;

		return "총 가격은 " + totalPrice + "원 입니다.";
	}	
}
