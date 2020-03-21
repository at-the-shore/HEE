package lotteria;

import java.util.ArrayList;

public class Bill {
	ArrayList<Burger> burger1; 
	// <burger>형의  ArrayList, 이름은 burger1 ?? 
	ArrayList<Drink> drink1;
	
	public Bill() {  // 기본생성자 
		
	}
	
	public Bill(ArrayList<Burger> burger1, ArrayList<Drink> drink1) {
		this.burger1 = burger1;
		this.drink1 = drink1;
	}
	
	public String bill() { 	// 입력 받은 메뉴들의 가격 총 가격을 계산할 메소드 
		
		int totalburger = 0;  // 햄버거의 총 가곅을 넣을 변수 totalburger 0으로 초기화 
		for (int i = 0; i < burger1.size(); i++) { //burger1리스트의 사이즈만큼 반복문을 실행 
			totalburger = totalburger + burger1.get(i).price; 
			// burger1의 ? ? ?
		}
			
		int totaldrink = 0;
		for (Drink drink : drink1) {  // drink = drink1.get(i)
			totaldrink = totaldrink + drink.price;
		}
		
		int totalPrice = totalburger + totaldrink;

		return "총 가격은 " + totalPrice + "원 입니다.";
	} 
}

