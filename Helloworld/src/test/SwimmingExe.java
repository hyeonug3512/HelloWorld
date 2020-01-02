package test;

import java.util.Scanner;

import classes.Account;

public class SwimmingExe {
	private static Swimming[] SwimmingArray = new Swimming[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================");
			System.out.println("1.ȸ���߰� | 2.ȸ������ | 3.ȸ������ | 4.ȸ������Ʈ | 5.����");
			System.out.println("========================");
			System.out.println("����> ");
			int selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				// ȸ���߰� ����.
				createMember();

			} else if (selectNo == 2) {
				// ȸ������ ����
				updateMember();

			} else if (selectNo == 3) {
				// ȸ������ ����
				deleteMember();

			} else if (selectNo == 4) {
				// ȸ������Ʈ ����
				listMember();

			} else if (selectNo == 5) {
				// ����
				run = false;
			}
		}
		System.out.println("���α׷� ����.");
	}

	static void createMember() {
		System.out.println("���̵� �Է�:");
		String memberId = sc.nextLine();
		System.out.println("�̸� �Է�:");
		String name = sc.nextLine();
		System.out.println("����ó �Է�:");
		String phone = sc.nextLine();
		
		Swimming sAry = new Swimming(memberId, name, phone);
		for (int i = 0; i < SwimmingArray.length; i++) {
			if (SwimmingArray[i] == null) {
				SwimmingArray[i] = sAry;
				break;
			}
		}
	}

	static void listMember() {
		for (Swimming sAry : SwimmingArray) {
			if (sAry != null) {
				System.out.println(sAry);
			}
		}

	}

	static void updateMember() {
		String memberId = sc.nextLine();
		System.out.println("���� �� �̸� �Է�:");
		String name = sc.nextLine();
		System.out.println("���� �� ����ó �Է�:");
		String phone = sc.nextLine();
		Swimming swm = findMember(memberId);
		swm.setName(name);
		swm.setPhone(phone);
		
	}

	static void deleteMember() {
		String memberId = sc.nextLine();
		System.out.println("������ ȸ�� ���̵� �Է�:");
		Swimming swm = findMember(memberId);
		swm.memberId = null;
		swm.name = null;
		swm.phone = null;
	}

	static Swimming findMember(String name) {
		Swimming swm = null;
		for (Swimming sAry : SwimmingArray) {
			if (sAry != null) {// null ���θ� üũ.
				if (name.contentEquals(sAry.getMemberId())) {
					swm = sAry;
					break;
				}
			}
		}
		return swm;

	}
}
