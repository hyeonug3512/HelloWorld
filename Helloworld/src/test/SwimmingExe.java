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
			System.out.println("1.회원추가 | 2.회원수정 | 3.회원삭제 | 4.회원리스트 | 5.종료");
			System.out.println("========================");
			System.out.println("선택> ");
			int selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				// 회원추가 구현.
				createMember();

			} else if (selectNo == 2) {
				// 회원수정 구현
				updateMember();

			} else if (selectNo == 3) {
				// 회원삭제 구현
				deleteMember();

			} else if (selectNo == 4) {
				// 회원리스트 구현
				listMember();

			} else if (selectNo == 5) {
				// 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	static void createMember() {
		System.out.println("아이디 입력:");
		String memberId = sc.nextLine();
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		System.out.println("연락처 입력:");
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
		System.out.println("수정 할 이름 입력:");
		String name = sc.nextLine();
		System.out.println("수정 할 연락처 입력:");
		String phone = sc.nextLine();
		Swimming swm = findMember(memberId);
		swm.setName(name);
		swm.setPhone(phone);
		
	}

	static void deleteMember() {
		String memberId = sc.nextLine();
		System.out.println("삭제할 회원 아이디 입렵:");
		Swimming swm = findMember(memberId);
		swm.memberId = null;
		swm.name = null;
		swm.phone = null;
	}

	static Swimming findMember(String name) {
		Swimming swm = null;
		for (Swimming sAry : SwimmingArray) {
			if (sAry != null) {// null 여부를 체크.
				if (name.contentEquals(sAry.getMemberId())) {
					swm = sAry;
					break;
				}
			}
		}
		return swm;

	}
}
