package lotteria;

public class bulgogiBurger extends burger{ // bulgogiBurger 는 상위클래스인 burger를 상속받음 
	
	String bulgogi; //지역변수, 불고기버거에만 있는 요소  bulgogi 
	
	public bulgogiBurger() { //기본생성자
		
	}
	
	public bulgogiBurger(String bulgogi, String bread, String meat, String va, String src, int price) {
		super(bread, meat, va, src, price); //super:부모 생성자의 요소들 
		this.bulgogi = bulgogi; //이 클래스(불고기)에만 있는 요소 
	}
	
	public void test() {
		System.out.println("고기는 = " + bulgogi);
		System.out.println("빵은 = " + bread);
		System.out.println("고기는 = " + meat);
		System.out.println("야채는 = " + va);
		System.out.println("소스는 = " + src);
		System.out.println("가격은 = " + price);
	} 
	
}
