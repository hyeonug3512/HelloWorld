package classes;

public class Person {

	String name;
	String birth;
	int age;

	Person() {

	}

	Person(String name, String birth, int age) {
		this.name = name;
		this.birth = birth;
		this.age = age;
	}

	void newMethod() {

	}

	void introduce() {
		System.out.println("�̸��� " + name + "�̰� ������ " + birth + "�̰� ���̴� " + age + "�Դϴ�.");
	}

}
