package lotteria;

public class CheezeBurger extends Burger{
	
	String cheeze; // ġ����ſ��� �ִ� ��� cheeze  
	
	public CheezeBurger() {
		
	}
	
	public CheezeBurger(String cheeze,String bread,String meat,String va,String src,int price) {
		super(bread, meat, va, src, price);
		this.cheeze = cheeze;
	}

	public void test() {
		System.out.println("ġ��� = " + cheeze);
		System.out.println("���� = " + bread);
		System.out.println("���� = " + meat);
		System.out.println("��ä�� = " + va);
		System.out.println("�ҽ��� = " + src);
		System.out.println("������ = " + price);
	} 
	
	
}
