package lotteria;

import java.util.ArrayList;

public class order {
	ArrayList<burger> burger1;
	ArrayList<drink> drink1;
	
	public order() { //접근제한자 class명() {}
		//기본
	}
	
	public order(ArrayList<burger> burger1, ArrayList<drink> drink1) {
		this.burger1 = burger1;
		this.drink1 = drink1;
	}
	
	public String bill() { //함수(메소드) : 접근제한자 반환형태 이름() {}
		// 입력 받은 메뉴들의 가격 총합
		int totalPrice = 0;
//		burger1.get(0).price
		return "총 가격은 " + totalPrice + "원 입니다.";
	} 
}

