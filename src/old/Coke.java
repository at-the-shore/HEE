package lotteria;

public class Coke extends Drink{
	
	String tansan;
	
	public Coke() {
		
	}
	
	public Coke(String tansan, String name, String ice, int price) {
		super(name, ice, price);
		this.tansan = tansan;
	}

	@Override
	public String toString() {
		return "coke [tansan=" + tansan + ", ice=" + ice + ", price=" + price + "]";
	}
}
