package lotteria;

public class bulgogiBurger extends burger{ // bulgogiBurger �� ����Ŭ������ burger�� ��ӹ��� 
	
	String bulgogi; //��������, �Ұ����ſ��� �ִ� ���  bulgogi 
	
	public bulgogiBurger() { //�⺻������
		
	}
	
	public bulgogiBurger(String bulgogi, String bread, String meat, String va, String src, int price) {
		super(bread, meat, va, src, price); //super:�θ� �������� ��ҵ� 
		this.bulgogi = bulgogi; //�� Ŭ����(�Ұ��)���� �ִ� ��� 
	}
	
	public void test() {
		System.out.println("���� = " + bulgogi);
		System.out.println("���� = " + bread);
		System.out.println("���� = " + meat);
		System.out.println("��ä�� = " + va);
		System.out.println("�ҽ��� = " + src);
		System.out.println("������ = " + price);
	} 
	
}
