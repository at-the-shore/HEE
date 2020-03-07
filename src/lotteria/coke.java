package lotteria;

public class coke extends drink{
	String tansan;
	
	public coke() {
		
	}
	
	public coke(String tansan, String ice, int price) {
		super(ice, price);
		this.tansan = tansan;
		
	}

	@Override
	public String toString() {
		return "coke [tansan=" + tansan + ", ice=" + ice + ", price=" + price + "]";
	}
	
	
}
