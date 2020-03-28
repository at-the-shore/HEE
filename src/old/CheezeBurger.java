package lotteria;

public class CheezeBurger extends Burger{
	
	String cheeze; // 치즈버거에만 있는 요소 cheeze  
	
	public CheezeBurger() {
		
	}
	
	public CheezeBurger(String cheeze,String bread,String meat,String va,String src,int price) {
		super(bread, meat, va, src, price);
		this.cheeze = cheeze;
	}

	public void test() {
		System.out.println("치즈는 = " + cheeze);
		System.out.println("빵은 = " + bread);
		System.out.println("고기는 = " + meat);
		System.out.println("야채는 = " + va);
		System.out.println("소스는 = " + src);
		System.out.println("가격은 = " + price);
	} 
	
	
}
