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
//		CheezeBurger cb = new CheezeBurger("��¥����", "������", "�Ұ��", "������丶��", "�������", 3000);
//		CheezeBurger cb2 = new CheezeBurger("��¥����", "�Ļ�", "�Ұ��", "�����", "�ɪy", 3500);
//		BulgogiBurger bb = new BulgogiBurger("�Ұ��", "�ձٻ�", "�Ұ��", "�����", "����", 4000);
//
//		Coke ck = new Coke("ź��", "�ݶ�", "������", 1000);
//		Juice orange = new Juice("������", "�������ֽ�", "ū����", 2500);
//		Juice apple = new Juice("���", "����꽺", "ū����", 2500);
//
//		ArrayList<Burger> burgerList = new ArrayList();
//		// <burger>���� ArrayList �� �����ϰ� �̸��� burgerList�� ��
//		burgerList.add(cb); // burgerList�� ������ ������ �ν��Ͻ��� cb�� �߰�
//		burgerList.add(cb2);
//		burgerList.add(bb);
//
//		ArrayList<Drink> drinkList = new ArrayList();
//		drinkList.add(ck);
//		drinkList.add(orange);
//		drinkList.add(apple);
//
//		System.out.println("1.����, 2.���忡�� �Ļ�");
//
//		int take; // ����/���� ����(1or2)�� ���� ��Ʈ�� ���� 'take'����
//		while (true) {
//			try { // ����ó�� try�� ����
//				Scanner sc = new Scanner(System.in);
//				take = sc.nextInt();
//
//				if (take != 1 && take != 2) { // if�� �ȿ� ��ü������ �߻��� ����Ǵ� ���ܻ����� ����
//					System.out.println("�ٽ� �Է����ּ���!!"); // if������ ���ܹ߻��� �ذ���
//				} else {
//					break;
//				}
//			} catch (Exception e) { // ??
//				e.printStackTrace(); // ���ܰ� �߻��� ������ ������
//				System.out.println("�ٽ� �Է����ּ���!!"); // ���� �߻��� �ذ���
//			}
//		}
//
//		ArrayList<Burger> mainMenuList = new ArrayList();
//
//		while (true) {
//			try {
//				System.out.println("�޴��� ����ּ���: ");
//				for (int i = 0; i < burgerList.size(); i++) {
//					System.out.println(i + "." + burgerList.get(i).bread);
//				}
//
//				Scanner sc1 = new Scanner(System.in);
//				int mainmenu = sc1.nextInt(); // ����
//				mainMenuList.add(burgerList.get(mainmenu)); // ���ܰ� �߻��Ҽ� �ִ� �κ�
//				System.out.println("---���� �ֹ��� �޴�---");
//				for (int i = 0; i < mainMenuList.size(); i++) {
//					System.out.println(mainMenuList.get(i).bread); // �޴����
//				}
//
//				System.out.println("�� ���ðڽ��ϱ�? 1.Yes, 2.No");
//				int mainMenuRepeat;
//				Scanner sc2 = new Scanner(System.in);
//				mainMenuRepeat = sc2.nextInt();
//
//				if (mainMenuRepeat != 1 && mainMenuRepeat != 2) {
//					System.out.println("�����߻�");
//					throw new RuntimeException("1���̳� 2���� �����ؾ� �մϴ�");
//					// ���α׷� �����߿� ������ �߻��� ���
//				}
//				if (mainMenuRepeat == 2) {
//					break;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("�ٽ� �Է����ּ���!!!!!!!");
//			}
//
//		}
//		ArrayList<Drink> drinkMenuList = new ArrayList();
//		while (true) {
//			try {
//				System.out.println("���Ḧ ����ּ��� : ");
//				for (int i = 0; i < drinkList.size(); i++) {
//					System.out.println(i + drinkList.get(i).name);
//				}
//
//				Scanner sc3 = new Scanner(System.in); // �Է¹޴� ����
//				int drinkMenu = sc3.nextInt(); // drinkMenu �Է¹��� �޴�
//				drinkMenuList.add(drinkList.get(drinkMenu));
//
//				System.out.println("-------------");
//				System.out.println("�� ���ðڽ��ϱ�? 1.Yes, 2.No");
//
//				int drinkMenuRepeat;
//				Scanner sc4 = new Scanner(System.in);
//				drinkMenuRepeat = sc4.nextInt();
//				if (drinkMenuRepeat != 1 && drinkMenuRepeat != 2) {
//					System.out.println("�����߻�");
//					throw new RuntimeException("1���̳� 2���� �����ؾ� �մϴ�");
//					// ���α׷� �����߿� ������ �߻��� ���
//				}
//				if (drinkMenuRepeat == 2) {
//					break;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("�ٽ� �Է����ּ���!!");
//			}
//		}
//		Bill od = new Bill(mainMenuList, drinkMenuList);
//		System.out.println(od.bill());
//
//		System.out.println("���������� �������ּ��� 1.����, 2.ī��");
//		System.out.println("-------------");
//
//		Scanner sc5 = new Scanner(System.in);
//		int pay = sc5.nextInt();
//
//		if (pay == 1) {
//			System.out.println("������ �������� : ����");
//		} else if (pay == 2) {
//			System.out.println("������ �������� : ī��");
//		}
//
//		if (take == 1) {
//			System.out.println("�����ϱ�");
//		} else if (take == 2) {
//			System.out.println("���忡�� �Ļ�");
//		}
//
//	}
//
//}
