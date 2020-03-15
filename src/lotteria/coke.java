package lotteria;

public class coke extends Drink{
	String tansan;
	
	public coke() {
		
	}
	
	public coke(String tansan, String name, String ice, int price) {
		super(name, ice, price);
		this.tansan = tansan;
		
	}

	@Override
	public String toString() {
		return "coke [tansan=" + tansan + ", ice=" + ice + ", price=" + price + "]";
	}
	
	
}
