package lotteria;

import java.sql.ResultSet;

import java.util.ArrayList;

public class MainPage {
	public static void main(String[] args) {

		ResultSet mainMenuResult = MysqlUtil.getQueryResult("select * from mainmenu");
		ArrayList<MainMenu> mainMenuList = new ArrayList();
		
		try {
			while (mainMenuResult.next()) {
				int id = mainMenuResult.getInt(1);
				String bread = mainMenuResult.getString(2);
				String meat = mainMenuResult.getString(3);
				String va = mainMenuResult.getString(4);
				String source = mainMenuResult.getString(5);
				String name = mainMenuResult.getString(6);
				int price = mainMenuResult.getInt(7);
				String option = mainMenuResult.getString(8);

				MainMenu mainMenu = new MainMenu(id, bread, meat, va, source, name, price, option);
				mainMenuList.add(mainMenu);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인메뉴 리스트입니다.");
		for (int i = 0; i < mainMenuList.size(); i++) {
			System.out.println("[" + i + "]" + mainMenuList.get(i).name);
		}


		ResultSet drinkMenuResult = MysqlUtil.getQueryResult("select * from drinkmenu");
		ArrayList<DrinkMenu> drinkMenuList = new ArrayList();

		try {
			while (drinkMenuResult.next()) {
				int id = drinkMenuResult.getInt(1);
				String name = drinkMenuResult.getString(2);
				int price = drinkMenuResult.getInt(3);
				boolean isHot = drinkMenuResult.getBoolean(4);
				int ice = drinkMenuResult.getInt(5);
				String material = drinkMenuResult.getString(6);
				String option = drinkMenuResult.getString(7);

				DrinkMenu drinkMenu = new DrinkMenu(id, name, price, isHot, ice, material, option);
				drinkMenuList.add(drinkMenu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("음료메뉴 리스트입니다.");
		for (int i = 0; i < drinkMenuList.size(); i++) {
			System.out.println(drinkMenuList.get(i).name);
		}
	}
}
