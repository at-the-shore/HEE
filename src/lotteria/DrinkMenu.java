package lotteria;

public class DrinkMenu {
	int id;
	String name;
	int price;
	boolean isHot;
	int ice;
	String material;
	String option;

	public DrinkMenu(int id, String name, int price, boolean isHot, int ice, String material, String option) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isHot = isHot;
		this.ice = ice;
		this.material = material;
		this.option = option;
	}

	public DrinkMenu() {
	}
//	public void setNamePrice(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
}
