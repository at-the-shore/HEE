package lotteria;

import java.util.ArrayList;

public class Bill {
	ArrayList<Burger> burger1; 
	// <burger>����  ArrayList, �̸��� burger1 ?? 
	ArrayList<Drink> drink1;
	
	public Bill() {  // �⺻������ 
		
	}
	
	public Bill(ArrayList<Burger> burger1, ArrayList<Drink> drink1) {
		this.burger1 = burger1;
		this.drink1 = drink1;
	}
	
	public String bill() { 	// �Է� ���� �޴����� ���� �� ������ ����� �޼ҵ� 
		
		int totalburger = 0;  // �ܹ����� �� ������ ���� ���� totalburger 0���� �ʱ�ȭ 
		for (int i = 0; i < burger1.size(); i++) { //burger1����Ʈ�� �����ŭ �ݺ����� ���� 
			totalburger = totalburger + burger1.get(i).price; 
			// burger1�� ? ? ?
		}
			
		int totaldrink = 0;
		for (Drink drink : drink1) {  // drink = drink1.get(i)
			totaldrink = totaldrink + drink.price;
		}
		
		int totalPrice = totalburger + totaldrink;

		return "�� ������ " + totalPrice + "�� �Դϴ�.";
	} 
}

