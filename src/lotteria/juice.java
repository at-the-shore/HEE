package lotteria;

public class juice extends Drink {
	String fu;
	
	public juice() {
		
	}
	
	public juice(String fu, String name, String ice, int price ) {
		super(name, ice, price);
		this.fu = fu;
	}
}
