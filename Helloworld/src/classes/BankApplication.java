package classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("========================");
			System.out.println("선택> ");
			int selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				// 계좌생성 구현.
				createAccount();

			} else if (selectNo == 2) {
				// 계좌목록 구현
				accountList();

			} else if (selectNo == 3) {
				// 예금 구현
				deposit();

			} else if (selectNo == 4) {
				// 출금
				withdraw();

			} else if (selectNo == 5) {
				// 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	static void createAccount() {
		System.out.println("계좌번호 입력:");
		String ano = sc.nextLine();
		System.out.println("사용자 입력:");
		String owner = sc.nextLine();
		System.out.println("금액입력:");
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
