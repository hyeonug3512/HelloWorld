package classes;

import java.util.Scanner;

public class FriendExe {
	static Scanner sc = new Scanner(System.in);
	static Friend[] fAry = new Friend[10];

	public static void main(String[] args) {
		boolean run = true;

		while (true) {
			System.out.println("========================");
			System.out.println("1.���� 2.��ȸ 3.����Ʈ. 4.����");
			System.out.println("========================");
			System.out.print("����>");
			int menu = sc.nextInt();
			if (menu == 1)
				createFriend();

			if (menu == 2)
				searchFriend();

			if (menu == 3)
				listFriend();

			if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");

				break;
			}
		}
	}

	static void createFriend() {

		System.out.println("1.�� �� 2.���е�â 3.ȸ�絿��");
		System.out.println("����>");
		int menu1 = sc.nextInt();
		if (menu1 == 1) {
			System.out.println("�̸��� �Է��ϼ���:");
			String name = sc.next();
			sc.nextLine();
			System.out.println("��ȣ�� �Է��ϼ���:");
			String phone = sc.next();
			Friend ff = new Friend(name, phone);

			for (int i = 0; i < fAry.length; i++) {
				if (fAry[i] == null) {
					fAry[i] = ff;
					break;
				}
			}
		}

		if (menu1 == 2) {
			System.out.print("�̸�: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("����ó: ");
			String phone = sc.next();
			System.out.print("�б��̸�: ");
			String univ = sc.next();
			System.out.print("����: ");
			String major = sc.next();
			UnivFriend uf = new UnivFriend(name, phone, univ, major);
			for (int i = 0; i < fAry.length; i++) {
				if (fAry[i] == null) {
					fAry[i] = uf;
					break;

				}
			}
		}
		if (menu1 == 3) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("��ȣ: ");
			String phone = sc.next();
			System.out.print("ȸ��: ");
			String company = sc.next();
			System.out.print("�μ�: ");
			String dept = sc.next();
			ComFriend cf = new ComFriend(name, phone, company, dept);
			for (int i = 0; i < fAry.length; i++) {
				if (fAry[i] == null) {
					fAry[i] = cf;
					break;
				}
			}
		}
	}

	static void searchFriend() {
		System.out.println("�̸� �Է�: ");
		String search = sc.next();
		for (int i = 0; i < fAry.length; i++) {
			if (fAry[i] != null) {
				if ((fAry[i].getName()).equals(search)) {
					fAry[i].introduce();
					break;
				}
			}
		}
	}

	static void listFriend() {
		for (Friend fff : fAry) {
			if (fff != null)
				fff.introduce();

		}
	}
}