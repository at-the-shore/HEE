package lotteria;

public class Burger { // �ܹ��ŵ��� ���� ���� Ŭ���� burger 
	String bread; // burger�鿡 �⺻������ ���� ��ҵ� : ��, ���, ��ä, �ҽ� , ���� 
	String meat;
	String va;
	String src; 
	int price;
	
	public Burger() { 	// �׻� �־�� �ϴ� �⺻ ������ 
		
	}
	
	public Burger(String bread, String meat, String va, String src, int price) {
		this.bread = bread; // �⺻ ��ҵ� ������ �ϼ� 
		this.meat = meat;
		this.va = va;
		this.src = src;
		this.price = price;
	}
}
