package lotteria;

public class cheezeBurger extends burger{

	
	String cheeze;
	
	public cheezeBurger() {
		
	}
	
	public cheezeBurger(String cheeze,String bread,String meat,String va,String src,int price) {
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
