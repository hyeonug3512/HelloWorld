package classes;


public class Student {
	// �ʵ�
	String university;
	String studentNo;
	String studentName;
	String major;
	int age;

	// ������
	Student() {
	}

	Student(String university, String studentNo, String studentName) {
		this.university = university;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// �޼ҵ�
	void newMethod() {
		
	}
	void introduce() {
		System.out.println("�й��� " + studentNo + "�̰� �̸��� " + studentName + "�Դϴ�.");
	}

	void study() {
		System.out.println("�����Ѵ�.");
	}

	void basketBall() {
		System.out.println("���Ѵ�.");
	}

	void sleep() {
		System.out.println("�����Ѵ�.");
	}

	void doHomework() {
		System.out.println("�����Ѵ�.");
	}
}