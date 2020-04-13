package lotteria;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class MainPage {

	public static void step1() {

		// ���� or ���忡�� �Ļ� ����
		System.out.println("[1]����\n[2]���忡�� �Ļ�");

		int take;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				take = sc.nextInt();

				if (take != 1 && take != 2) {
					System.out.println("�ٽ� �Է����ּ���!!");
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�ٽ� �Է����ּ���!!");
			}
		}
		isTake = take;
		step2();
	}

	public static void step2() { // ���׸�
		// ���θ޴� ����
		ResultSet mainMenuResult = MysqlUtil.getQueryResult("select * from mainmenu");
		ArrayList<MainMenu> mainMenuList = new ArrayList();
		ArrayList<MainMenu> selectedList = new ArrayList();
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
		while (true) {
			try {
				System.out.println("���θ޴��� ��� �ּ���");
				for (int i = 0; i < mainMenuList.size(); i++) {
					System.out.println("[" + i + "]" + mainMenuList.get(i).name);
				}
				System.out.println("[9]�ڷΰ���");

				Scanner sc1 = new Scanner(System.in);
				int mainmenutake = sc1.nextInt();
				if (mainmenutake == 9) {
					step1();
					break;
				}

				if (mainmenutake != 1 && mainmenutake != 2 && mainmenutake != 3 && mainmenutake != 4
						&& mainmenutake != 5 && mainmenutake != 0) {
					System.out.println("�ٽ� �Է����ּ���!!");
				} else {
					selectedList.add(mainMenuList.get(mainmenutake));
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		selectedMainMenuList = selectedList;
		step3();
	}

	public static void step3() {
		// ����޴� ����
		ResultSet drinkMenuResult = MysqlUtil.getQueryResult("select * from drinkmenu");
		ArrayList<DrinkMenu> drinkMenuList = new ArrayList();
		ArrayList<DrinkMenu> selectedList = new ArrayList();

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
		while (true) {
			try {
				System.out.println("����޴��� ��� �ּ���");
				for (int i = 0; i < drinkMenuList.size(); i++) {
					System.out.println("[" + i + "]" + drinkMenuList.get(i).name);
				}
				System.out.println("[9]�ڷΰ���");

				Scanner sc2 = new Scanner(System.in);
				int drinkmenutake = sc2.nextInt();
				if (drinkmenutake == 9) {
					step2();
					break;
				}

				if (drinkmenutake != 0 && drinkmenutake != 1 && drinkmenutake != 2 && drinkmenutake != 3
						&& drinkmenutake != 4 && drinkmenutake != 5 && drinkmenutake != 6 && drinkmenutake != 7) {
					System.out.println("�ٽ� �Է����ּ���!!");
				} else {
					selectedList.add(drinkMenuList.get(drinkmenutake));
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		selectedDrinkMenuList = selectedList;
		step4();
	}

	public static void step4() {
		// ���� ���� ����
		Order od = new Order(selectedMainMenuList, selectedDrinkMenuList);
		System.out.println(od.order());

		System.out.println("���������� �������ּ��� 1.����, 2.ī��, 3.�ڷΰ���");
		System.out.println("-------------");

		Scanner sc5 = new Scanner(System.in);
		int pay = sc5.nextInt();

		if (pay == 1) {
			System.out.println("������ �������� : ����");
		} else if (pay == 2) {
			System.out.println("������ �������� : ī��");
		} else if (pay == 3) {
			step3();
		}
	}

	static int isTake;
	static ArrayList<MainMenu> selectedMainMenuList;
	static ArrayList<DrinkMenu> selectedDrinkMenuList;

	public static void main(String[] args) {

		step1();
		// ArrayList<MainMenu> selectedMainMenuList = step2();
		// ArrayList<DrinkMenu> selectedDrinkMenuList = step3();
		// step4(selectedMainMenuList, selectedDrinkMenuList);
	}
}
