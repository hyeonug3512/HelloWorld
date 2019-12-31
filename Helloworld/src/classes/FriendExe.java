package classes;

import java.util.Scanner;

public class FriendExe {
	static Scanner sc = new Scanner(System.in);
	static Friend[] fAry = new Friend[10];

	public static void main(String[] args) {
		boolean run = true;

		while (true) {
			System.out.println("========================");
			System.out.println("1.생성 2.조회 3.리스트. 4.종료");
			System.out.println("========================");
			System.out.print("선택>");
			int menu = sc.nextInt();
			if (menu == 1)
				createFriend();

			if (menu == 2)
				searchFriend();

			if (menu == 3)
				listFriend();

			if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");

				break;
			}
		}
	}

	static void createFriend() {

		System.out.println("1.그 외 2.대학동창 3.회사동료");
		System.out.println("선택>");
		int menu1 = sc.nextInt();
		if (menu1 == 1) {
			System.out.println("이름을 입력하세요:");
			String name = sc.next();
			sc.nextLine();
			System.out.println("번호를 입력하세요:");
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
			System.out.print("이름: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("연락처: ");
			String phone = sc.next();
			System.out.print("학교이름: ");
			String univ = sc.next();
			System.out.print("전공: ");
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
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("번호: ");
			String phone = sc.next();
			System.out.print("회사: ");
			String company = sc.next();
			System.out.print("부서: ");
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
		System.out.println("이름 입력: ");
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