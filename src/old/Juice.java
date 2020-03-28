package lotteria;

public class Juice extends Drink {
	
	String fu;
	
	public Juice() {
		
	}
	
	public Juice(String fu, String name, String ice, int price ) {
		super(name, ice, price);
		this.fu = fu;
	}

	@Override
	public String toString() {
		return "Juice [fu=" + fu + ", name=" + name + ", ice=" + ice + ", price=" + price + "]";
	}


	

	
	
	
}
