package classes;

import java.util.Scanner;

public class FriendExe {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================");
			System.out.println("1.�Է� | 2.��ȸ | 3.����Ʈ | 4.���� ");
			System.out.println("========================");
			System.out.println("����> ");
			int selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				// �Է�
				createAccount();

			} else if (selectNo == 2) {
				// ��ȸ
				accountList();

			} else if (selectNo == 3) {
				// ����Ʈ
				deposit();

			} else if (selectNo == 4) {
				// ����
				run = false;

			
			}
		}
		System.out.println("���α׷� ����.");
	}

	static void createAccount() {
		System.out.println("���б� ��â:");
		String ano = sc.nextLine();
		System.out.println("ȸ�絿��:");
		String owner = sc.nextLine();
		System.out.println("�� ��:");
		int balance = sc.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
	}

	static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}

	}

	static void deposit() {
		System.out.println("��ȸ �� ���� �Է�:");
		String ano = sc.nextLine();
		System.out.println("�Ա� �� �ݾ� �Է�:");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// ���ܰ�
		accnt.setBalance(balance + amount);
	}

	static void withdraw() {
		System.out.println("��ȸ �� ���� �Է�:");
		String ano = sc.nextLine();
		System.out.println("��� �� �ݾ� �Է�:");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// ���ܰ�
		accnt.setBalance(balance - amount);
	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) {// null ���θ� üũ.
				if (ano.contentEquals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}
		return accnt;

	}
}