package lotteria;

public class burger { // �ܹ��ŵ��� ���� ���� Ŭ���� burger 
	String bread; // burger�鿡 �⺻������ ���� ��ҵ� : ��, ���, ��ä, �ҽ� , ���� 
	String meat;
	String va;
	String src; 
	int price;
	
	public burger() { 	// �׻� �־�� �ϴ� �⺻ ������ 
		
	}
	
	public burger(String bread, String meat, String va, String src, int price) {
		this.bread = bread; // �⺻ ��ҵ� ������ �ϼ� 
		this.meat = meat;
		this.va = va;
		this.src = src;
		this.price = price;
	}
}
