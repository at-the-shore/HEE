package lotteria;

import java.util.*;


public class mainPage {

	public static void main(String[] args) {
	cheezeBurger cb = new cheezeBurger("모짜렐라","참깨빵","소고기","양상추토마토","마요네즈",3000);
	cheezeBurger cb2 = new cheezeBurger("모짜렐라","식빵","소고기","양상추","케챱",3500);
	
//	cb.test();
//	cb2.test();
//	
	coke ck = new coke("탄산","각얼음",1000);
	
	String result = ck.toString();
	System.out.println(result);
	
	ArrayList<burger> burgerList = new ArrayList();
	burgerList.add(cb);
	burgerList.add(cb2);

	ArrayList<drink> drinkList = new ArrayList();
//	drinkList.add(.)
	
	/*for (int i = 0; i < burgerList.size() ; i++) { //컬렉션의 size만큼 루프를 돌려서 하나씩 검사
		burgerList.get(i).test(); //출력 
	}*/
	
//	for (cheezeBurger cheezeb : burgerList) { //list, 배열 전용 
//		cheezeb.test();
//	}
	
	order od = new order(burgerList, drinkList);
	System.out.println(od.bill());
	
	}
	

}

