package lotteria;

import java.util.ArrayList;

public class order {
	ArrayList<burger> burger1;
	ArrayList<drink> drink1;
	
	public order() { //���������� class��() {}
		//�⺻
	}
	
	public order(ArrayList<burger> burger1, ArrayList<drink> drink1) {
		this.burger1 = burger1;
		this.drink1 = drink1;
	}
	
	public String bill() { //�Լ�(�޼ҵ�) : ���������� ��ȯ���� �̸�() {}
		// �Է� ���� �޴����� ���� ����
		int totalPrice = 0;
//		burger1.get(0).price
		return "�� ������ " + totalPrice + "�� �Դϴ�.";
	} 
}

