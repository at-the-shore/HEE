package lotteria;

import java.util.*;

public class mainPage {

	public static void main(String[] args) {
		cheezeBurger cb = new cheezeBurger("��¥����", "������", "�Ұ���", "������丶��", "�������", 3000);
		cheezeBurger cb2 = new cheezeBurger("��¥����", "�Ļ�", "�Ұ���", "�����", "�ɪy", 3500);
//	
////	cb.test();
////	cb2.test();
////	
		coke ck = new coke("ź��", "�ݶ�", "������", 1000);
		juice orange = new juice("������", "�������ֽ�", "ū����", 2500);
//	
//	String result = ck.toString();
//	System.out.println(result);
//	
		ArrayList<burger> burgerList = new ArrayList();
		burgerList.add(cb);
		burgerList.add(cb2);
//
		ArrayList<Drink> drinkList = new ArrayList();
		drinkList.add(ck);
		drinkList.add(orange);

		/*
		 * for (int i = 0; i < burgerList.size() ; i++) { //�÷����� size��ŭ ������ ������ �ϳ��� �˻�
		 * burgerList.get(i).test(); //��� }
		 */

//	for (cheezeBurger cheezeb : burgerList) { //list, �迭 ���� 
//		cheezeb.test();
//	}

//	order od = new order(burgerList, drinkList);
//	System.out.println(od.bill());

		System.out.println("1.����, 2.���忡�� �Ļ�");

		int take;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				take = sc.nextInt();

				if (take != 1 && take != 2) {
					System.out.println("�ٽ� �Է����ּ���!!!!!!!");
				} else {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace(); // ���ܰ� �߻��� ������ ������
				System.out.println("�ٽ� �Է����ּ���!!!!!!!");

			}
		}

		ArrayList<burger> mainMenuList = new ArrayList();

		while (true) {
			System.out.println("�޴��� ����ּ���: ");
			for (int i = 0; i < burgerList.size(); i++) {
				System.out.println(i + "." + burgerList.get(i).bread);
			}

			Scanner sc1 = new Scanner(System.in);
			int mainmenu = sc1.nextInt(); // ������
			mainMenuList.add(burgerList.get(mainmenu));
			System.out.println("���� �ֹ��� �޴�\r-------------"); // /n:�ٹٲ� /t:�� /r:�ٹٲ�(������ ����)

			for (int i = 0; i < mainMenuList.size(); i++) {
				System.out.println(mainMenuList.get(i).bread); // �޴����
			}
			System.out.println("-------------");
			System.out.println("�� �����ðڽ��ϱ�? 1.Yes, 2.No");
			int mainMenuRepeat;
			Scanner sc2 = new Scanner(System.in);
			mainMenuRepeat = sc2.nextInt();

			if (mainMenuRepeat == 2) {
				break;
			}

		}
		ArrayList<Drink> drinkMenuList = new ArrayList();
		while (true) {
			System.out.println("���Ḧ ����ּ���/n-------------");
			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println(i + drinkList.get(i).name);
			}

			Scanner sc3 = new Scanner(System.in); // �Է¹޴� ����
			int drinkMenu = sc3.nextInt(); // drinkMenu �Է¹��� �޴�
			drinkMenuList.add(drinkList.get(drinkMenu));

			System.out.println("-------------");
			System.out.println("�� �����ðڽ��ϱ�? 1.Yes, 2.No");

			int drinkMenuRepeat;
			Scanner sc4 = new Scanner(System.in);
			drinkMenuRepeat = sc4.nextInt();

			if (drinkMenuRepeat == 2) {
				break;
			}
		}
		order od = new order(mainMenuList, drinkMenuList);
		System.out.println(od.bill());

		System.out.println("���������� �������ּ��� 1.����, 2.ī��");
		System.out.println("-------------");

		Scanner sc5 = new Scanner(System.in);
		int pay = sc5.nextInt();

		if (pay == 1) {
			System.out.println("������ �������� : ����");
		} else if (pay == 2) {
			System.out.println("������ �������� : ī��");
		}

		if (take == 1) {
			System.out.println("�����ϱ�");
		} else if (take == 2) {
			System.out.println("���忡�� �Ļ�");
		}

	}

}