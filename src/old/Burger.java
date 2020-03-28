package lotteria;

public class Burger { // 햄버거들의 가장 상위 클래스 burger 
	String bread; // burger들에 기본적으로 들어가는 요소들 : 빵, 고기, 야채, 소스 , 가격 
	String meat;
	String va;
	String src; 
	int price;
	
	public Burger() { 	// 항상 있어야 하는 기본 생성자 
		
	}
	
	public Burger(String bread, String meat, String va, String src, int price) {
		this.bread = bread; // 기본 요소들 생성자 완성 
		this.meat = meat;
		this.va = va;
		this.src = src;
		this.price = price;
	}
}
