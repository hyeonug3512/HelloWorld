package classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "±èÃ¶¼ö";
		p1.birth = "1994-12-23";
		p1.age = 26;

		Person p2 = new Person();
		p2.name = "¹ÚÃ¶¼ö";
		p2.birth = "1993-11-04";
		p2.age = 27;

		Person p3 = new Person();
		p3.name = "ÀåÃ¶¼ö";
		p3.birth = "1990-10-11";
		p3.age = 30;

		Person[] PAry = new Person[3];
		PAry[0] = p1;
		PAry[1] = p2;
		PAry[2] = p3;

		p1.introduce();
		p2.introduce();
		p3.introduce();

	}

}
