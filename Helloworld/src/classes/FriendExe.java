package classes;

import java.util.Scanner;

public class FriendExe {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================");
			System.out.println("1.입력 | 2.조회 | 3.리스트 | 4.종료 ");
			System.out.println("========================");
			System.out.println("선택> ");
			int selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				// 입력
				createAccount();

			} else if (selectNo == 2) {
				// 조회
				accountList();

			} else if (selectNo == 3) {
				// 리스트
				deposit();

			} else if (selectNo == 4) {
				// 종료
				run = false;

			
			}
		}
		System.out.println("프로그램 종료.");
	}

	static void createAccount() {
		System.out.println("대학교 동창:");
		String ano = sc.nextLine();
		System.out.println("회사동료:");
		String owner = sc.nextLine();
		System.out.println("그 외:");
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
		System.out.println("조회 할 계좌 입력:");
		String ano = sc.nextLine();
		System.out.println("입금 할 금액 입력:");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// 현잔고
		accnt.setBalance(balance + amount);
	}

	static void withdraw() {
		System.out.println("조회 할 계좌 입력:");
		String ano = sc.nextLine();
		System.out.println("출금 할 금액 입력:");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// 현잔고
		accnt.setBalance(balance - amount);
	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) {// null 여부를 체크.
				if (ano.contentEquals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}
		return accnt;

	}
}