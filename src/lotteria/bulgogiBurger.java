package lotteria;

public class bulgogiBurger extends burger{
	
	String bulgogi; //�������� 
	
	public bulgogiBurger() { //�⺻������
		
	}
	
	public bulgogiBurger(String bulgogi, String bread, String meat, String va, String src, int price) {
		super(bread, meat, va, src, price); //super:�θ��� ������ 
		this.bulgogi = bulgogi;
		
	}

}
