package lotteria;

public class bulgogiBurger extends burger{
	
	String bulgogi; //지역변수 
	
	public bulgogiBurger() { //기본생성자
		
	}
	
	public bulgogiBurger(String bulgogi, String bread, String meat, String va, String src, int price) {
		super(bread, meat, va, src, price); //super:부모의 생성자 
		this.bulgogi = bulgogi;
		
	}

}
