package lotteria;

import java.util.ArrayList;

public class order {
	ArrayList<burger> burger1;
	ArrayList<Drink> drink1;
	
	public order() { //���������� class��() {}
		//�⺻
	}
	
	public order(ArrayList<burger> burger1, ArrayList<Drink> drink1) {
		this.burger1 = burger1;
		this.drink1 = drink1;
	}
	
	public String bill() { //�Լ�(�޼ҵ�) : ���������� ��ȯ���� �̸�() {}
		// �Է� ���� �޴����� ���� ����
		
		int totalburger = 0;
		for (int i = 0; i < burger1.size(); i++) {
			totalburger = totalburger + burger1.get(i).price;
		}
			
		int totaldrink = 0;
		for (Drink drink : drink1) {  // drink = drink1.get(i)
			totaldrink = totaldrink + drink.price;
		}
		
		int totalPrice = totalburger + totaldrink;

		return "�� ������ " + totalPrice + "�� �Դϴ�.";
	} 
}

