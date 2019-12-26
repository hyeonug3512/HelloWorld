package classes;

import java.util.Scanner;

public class MemberExample {
	 Member[] memberAry = new Member[3];
	 Scanner sc = new Scanner(System.in);

	public void main(String[] args) {
		execute();
		}
	
	public void execute() {
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("==================");
			System.out.println("1.���� 2.��ȸ 3.����Ʈ 4.����");
			System.out.println("==================");
			System.out.println("����>2Enter");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}
		
		System.out.println("���α׷� ����.");
		}
	}
	public  void searchMember() {
		System.out.print("id�Է��ϼ���.");
		String inputId = sc.nextLine();
		System.out.print("pw�Է��ϼ���.");
		String inputPw = sc.nextLine();
		for (Member mem : memberAry) {
			if(mem!= null) {
				if (inputId.equals(mem.getId()) && inputPw.contentEquals(mem.getPassword())) {
					System.out.println(mem);
			}else if(inputId.equals(mem.getId()) && !inputPw.contentEquals(mem.getPassword())) {
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}else if(!inputId.equals(mem.getId()) && !inputPw.contentEquals(mem.getPassword())) {
				System.out.println("���� id�Դϴ�.");
			}
				// id,pw ==> ok!
			//id(o), pw(x) => "��й�ȣ�� Ʋ���ϴ�."
			//id(x), pw(x) => "���� id�Դϴ�"
		}
	}
}
	
	public  void listMember() {
		for (Member m : memberAry) {
			if (m != null)
				System.out.println(m);
		}
	}

	public  void createMember() {
		Member mem = new Member();
		System.out.println("�̸��� �Է�: ");
		String name = sc.nextLine();
		mem.setName(name);
		System.out.println("id�� �Է�: ");
		String id = sc.nextLine();
		mem.setId(id);
		System.out.println("pw�� �Է�: ");
		String password = sc.nextLine();
		mem.setPassword(password);
		System.out.println("age�� �Է�: ");
		int age = sc.nextInt();
		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}

	}

}
