package classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("========================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("========================");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			 }else if(selectNo ==2) {
				 accountList();
			 }else if(selectNo ==3) {
				 deposit();
			 }else if(selectNo ==4) {
				 withdraw();
			 }else if(selectNo ==5) {
				 run = false;
			 }
		}
		System.out.println("프로그램 종료.");
			 }
		private static void createAccount() {
			Account acc = new Account(null, null, 0);
			System.out.println("계좌번호를 입력:");
			String AccountNumber = sc.nextLine();
			acc.setAccountNumber(AccountNumber);
		}
		private static void accountList() {
		}
		private static void deposit() {
		}
		private static void withdraw() {
		}
		
		private static Account findAccount(String ano) {
		}
	}


