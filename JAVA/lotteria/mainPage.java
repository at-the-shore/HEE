package lotteria;

import java.util.*;

public class mainPage {

	public static void main(String[] args) {
		cheezeBurger cb = new cheezeBurger("모짜렐라", "참깨빵", "소고기", "양상추토마토", "마요네즈", 3000);
		cheezeBurger cb2 = new cheezeBurger("모짜렐라", "식빵", "소고기", "양상추", "케챱", 3500);
	
		coke ck = new coke("탄산", "콜라", "각얼음", 1000);
		juice orange = new juice("오렌지", "오렌지주스", "큰얼음", 2500);

		ArrayList<burger> burgerList = new ArrayList();
		burgerList.add(cb);
		burgerList.add(cb2);

		ArrayList<Drink> drinkList = new ArrayList();
		drinkList.add(ck);
		drinkList.add(orange);

		System.out.println("1.포장, 2.매장에서 식사");

		int take;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				take = sc.nextInt();

				if (take != 1 && take != 2) {
					System.out.println("다시 입력해주세요!!!!!!!");
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace(); // 예외가 발생한 이유를 보여줌
				System.out.println("다시 입력해주세요!!!!!!!");
			}
		}

		ArrayList<burger> mainMenuList = new ArrayList();

		while (true) {
			System.out.println("메뉴를 골라주세요: ");
			for (int i = 0; i < burgerList.size(); i++) {
				System.out.println(i + "." + burgerList.get(i).bread);
			}

			Scanner sc1 = new Scanner(System.in);
			int mainmenu = sc1.nextInt(); // 고르기
			mainMenuList.add(burgerList.get(mainmenu));
			System.out.println("현재 주문한 메뉴\r-------------"); // /n:줄바꿈 /t:탭 /r:줄바꿈(공백을 날림)

			for (int i = 0; i < mainMenuList.size(); i++) {
				System.out.println(mainMenuList.get(i).bread); // 메뉴출력
			}
			System.out.println("-------------");
			System.out.println("더 고르시겠습니까? 1.Yes, 2.No");
			int mainMenuRepeat;
			Scanner sc2 = new Scanner(System.in);
			mainMenuRepeat = sc2.nextInt();

			if (mainMenuRepeat == 2) {
				break;
			}
		}
		ArrayList<Drink> drinkMenuList = new ArrayList();
		while (true) {
			System.out.println("음료를 골라주세요/n-------------");
			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println(i + drinkList.get(i).name);
			}

			Scanner sc3 = new Scanner(System.in); // 입력받는 도구
			int drinkMenu = sc3.nextInt(); // drinkMenu 입력받은 메뉴
			drinkMenuList.add(drinkList.get(drinkMenu));

			System.out.println("-------------");
			System.out.println("더 고르시겠습니까? 1.Yes, 2.No");

			int drinkMenuRepeat;
			Scanner sc4 = new Scanner(System.in);
			drinkMenuRepeat = sc4.nextInt();

			if (drinkMenuRepeat == 2) {
				break;
			}
		}
		order od = new order(mainMenuList, drinkMenuList);
		System.out.println(od.bill());

		System.out.println("결제수단을 선택해주세요 1.현금, 2.카드");
		System.out.println("-------------");

		Scanner sc5 = new Scanner(System.in);
		int pay = sc5.nextInt();

		if (pay == 1) {
			System.out.println("선택한 결제수단 : 현금");
		} else if (pay == 2) {
			System.out.println("선택한 결제수단 : 카드");
		}

		if (take == 1) {
			System.out.println("포장하기");
		} else if (take == 2) {
			System.out.println("매장에서 식사");
		}

	}

}
