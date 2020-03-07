package lotteria;

public class burger {
	String bread;
	String meat;
	String va;
	String src; 
	int price;
	
	public burger() {
		//기본 생성자 항상 있어야 함	
	}
	
	public burger(String bread, String meat, String va, String src, int price) {
		this.bread = bread; //생성자 완성! 
		this.meat = meat;
		this.va = va;
		this.src = src;
		this.price = price;
	}
}
