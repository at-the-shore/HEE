package lotteria;

import java.util.*;


public class mainPage {

	public static void main(String[] args) {
	cheezeBurger cb = new cheezeBurger("��¥����","������","�Ұ��","������丶��","�������",3000);
	cheezeBurger cb2 = new cheezeBurger("��¥����","�Ļ�","�Ұ��","�����","�ɪy",3500);
	
//	cb.test();
//	cb2.test();
//	
	coke ck = new coke("ź��","������",1000);
	
	String result = ck.toString();
	System.out.println(result);
	
	ArrayList<burger> burgerList = new ArrayList();
	burgerList.add(cb);
	burgerList.add(cb2);

	ArrayList<drink> drinkList = new ArrayList();
//	drinkList.add(.)
	
	/*for (int i = 0; i < burgerList.size() ; i++) { //�÷����� size��ŭ ������ ������ �ϳ��� �˻�
		burgerList.get(i).test(); //��� 
	}*/
	
//	for (cheezeBurger cheezeb : burgerList) { //list, �迭 ���� 
//		cheezeb.test();
//	}
	
	order od = new order(burgerList, drinkList);
	System.out.println(od.bill());
	
	}
	

}

