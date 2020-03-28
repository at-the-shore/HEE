package old;

//package lotteria;
//
//import java.util.*;
//
//public class mainPage2 {
//
//	public static void main(String[] args) {
//		
//		MysqlUtil.init();
//		
//		CheezeBurger cb = new CheezeBurger("모짜렐라", "참깨빵", "소고기", "양상추토마토", "마요네즈", 3000);
//		CheezeBurger cb2 = new CheezeBurger("모짜렐라", "식빵", "소고기", "양상추", "케챱", 3500);
//		BulgogiBurger bb = new BulgogiBurger("불고기", "둥근빵", "불고기", "양상추", "케찹", 4000);
//
//		Coke ck = new Coke("탄산", "콜라", "각얼음", 1000);
//		Juice orange = new Juice("오렌지", "오렌지주스", "큰얼음", 2500);
//		Juice apple = new Juice("사과", "사과쥬스", "큰얼음", 2500);
//
//		ArrayList<Burger> burgerList = new ArrayList();
//		// <burger>형의 ArrayList 를 생성하고 이름을 burgerList로 함
//		burgerList.add(cb); // burgerList에 위에서 생성한 인스턴스인 cb를 추가
//		burgerList.add(cb2);
//		burgerList.add(bb);
//
//		ArrayList<Drink> drinkList = new ArrayList();
//		drinkList.add(ck);
//		drinkList.add(orange);
//		drinkList.add(apple);
//
//		System.out.println("1.포장, 2.매장에서 식사");
//
//		int take; // 포장/매장 여부(1or2)를 담을 인트형 변수 'take'선언
//		while (true) {
//			try { // 예외처리 try문 시작
//				Scanner sc = new Scanner(System.in);
//				take = sc.nextInt();
//
//				if (take != 1 && take != 2) { // if문 안에 구체적으로 발생이 예상되는 예외사항을 넣음
//					System.out.println("다시 입력해주세요!!"); // if문에서 예외발생시 해결방안
//				} else {
//					break;
//				}
//			} catch (Exception e) { // ??
//				e.printStackTrace(); // 예외가 발생한 이유를 보여줌
//				System.out.println("다시 입력해주세요!!"); // 예외 발생시 해결방안
//			}
//		}
//
//		ArrayList<Burger> mainMenuList = new ArrayList();
//
//		while (true) {
//			try {
//				System.out.println("메뉴를 골라주세요: ");
//				for (int i = 0; i < burgerList.size(); i++) {
//					System.out.println(i + "." + burgerList.get(i).bread);
//				}
//
//				Scanner sc1 = new Scanner(System.in);
//				int mainmenu = sc1.nextInt(); // 고르기
//				mainMenuList.add(burgerList.get(mainmenu)); // 예외가 발생할수 있는 부분
//				System.out.println("---현재 주문한 메뉴---");
//				for (int i = 0; i < mainMenuList.size(); i++) {
//					System.out.println(mainMenuList.get(i).bread); // 메뉴출력
//				}
//
//				System.out.println("더 고르시겠습니까? 1.Yes, 2.No");
//				int mainMenuRepeat;
//				Scanner sc2 = new Scanner(System.in);
//				mainMenuRepeat = sc2.nextInt();
//
//				if (mainMenuRepeat != 1 && mainMenuRepeat != 2) {
//					System.out.println("에러발생");
//					throw new RuntimeException("1번이나 2번을 선택해야 합니다");
//					// 프로그램 러닝중에 문제가 발생한 경우
//				}
//				if (mainMenuRepeat == 2) {
//					break;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("다시 입력해주세요!!!!!!!");
//			}
//
//		}
//		ArrayList<Drink> drinkMenuList = new ArrayList();
//		while (true) {
//			try {
//				System.out.println("음료를 골라주세요 : ");
//				for (int i = 0; i < drinkList.size(); i++) {
//					System.out.println(i + drinkList.get(i).name);
//				}
//
//				Scanner sc3 = new Scanner(System.in); // 입력받는 도구
//				int drinkMenu = sc3.nextInt(); // drinkMenu 입력받은 메뉴
//				drinkMenuList.add(drinkList.get(drinkMenu));
//
//				System.out.println("-------------");
//				System.out.println("더 고르시겠습니까? 1.Yes, 2.No");
//
//				int drinkMenuRepeat;
//				Scanner sc4 = new Scanner(System.in);
//				drinkMenuRepeat = sc4.nextInt();
//				if (drinkMenuRepeat != 1 && drinkMenuRepeat != 2) {
//					System.out.println("에러발생");
//					throw new RuntimeException("1번이나 2번을 선택해야 합니다");
//					// 프로그램 러닝중에 문제가 발생한 경우
//				}
//				if (drinkMenuRepeat == 2) {
//					break;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("다시 입력해주세요!!");
//			}
//		}
//		Bill od = new Bill(mainMenuList, drinkMenuList);
//		System.out.println(od.bill());
//
//		System.out.println("결제수단을 선택해주세요 1.현금, 2.카드");
//		System.out.println("-------------");
//
//		Scanner sc5 = new Scanner(System.in);
//		int pay = sc5.nextInt();
//
//		if (pay == 1) {
//			System.out.println("선택한 결제수단 : 현금");
//		} else if (pay == 2) {
//			System.out.println("선택한 결제수단 : 카드");
//		}
//
//		if (take == 1) {
//			System.out.println("포장하기");
//		} else if (take == 2) {
//			System.out.println("매장에서 식사");
//		}
//
//	}
//
//}
