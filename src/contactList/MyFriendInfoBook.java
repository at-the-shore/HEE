package contactList;

import java.util.*;


class Friend {
	String name, phone, addr;


	public Friend(String name, String phone, String addr) {
	
		this.name = name;
		this.phone = phone; 
		this.addr = addr;
	}
	public void showData() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);
		System.out.println("�ּ�: " + addr);
	}
	public void showBasicInfo() {} 
}

class HighFriend extends Friend {
	String job;		
	public HighFriend(String name, String phone, String addr, String job) {
	
		super(name, phone, addr);
	
		this.job = job;
	}
	public void showData() {	
		super.showData();
		System.out.println("����: " + job);
	}
	public void showBasicInfo() {	
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);
	}
}

class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	public void showData() {
		super.showData();
		System.out.println("����: " + major);
	}
	public void showBasicInfo() { 
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);
		System.out.println("����: " + major);
	}
}

class FriendInfoHandler {
	private Friend[] myFriends;
	
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {	
	
		myFriends = new Friend[num];
		
		numOfFriends = 0; 
		
	}
	private void addFriendInfo(Friend fren) {
	
		myFriends[numOfFriends] = fren;
		
		numOfFriends++;
		
	}
	public void addFriend(int choice) {
	
		String name, phone, addr, job, major; 
		

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");		name = sc.nextLine(); 
		System.out.print("��ȭ: ");		phone = sc.nextLine();
		System.out.print("�ּ�: ");		addr = sc.nextLine();

		if (choice == 1)	{	
			System.out.print("����: ");		job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, job)); 
		} else {
			System.out.print("����: ");		major = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, major));
		}
		System.out.println("�Է� �Ϸ�\n");
	}
	public void showAllData() {
		for (int i = 0; i < numOfFriends ; i++ ) {
		
			myFriends[i].showData();
			
			System.out.println();
		}
	}
	public void showAllSimpleData() {
		for (int i = 0; i < numOfFriends ; i++ ) {
			myFriends[i].showBasicInfo();
			
			System.out.println();
		}
	}
}

class MyFriendInfoBook {
	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(10);

		while (true) {
	
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �� ģ�� ����");
			System.out.println("2. ���� ģ�� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");
			System.out.println("5. ���α׷� ����");
			System.out.print("���� >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); //�̰����� ������

			switch (choice) {
			case 1: case 2:
				handler.addFriend(choice);	break;
			case 3:
				handler.showAllData();		break;
			case 4:
				handler.showAllSimpleData();	break;
			case 5:
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
		}
	}
}
