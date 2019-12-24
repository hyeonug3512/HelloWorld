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
		System.out.println("이름은 " + name + "이고 생일은 " + birth + "이고 나이는 " + age + "입니다.");
	}

}
