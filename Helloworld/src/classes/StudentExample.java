package classes;

public class StudentExample {
	public static void main(String[] args) {
//		String str = "Hello";
//		String str1 = new String("Hello");

		Student student = new Student();
		student.studentNo = "191234-1234";
		student.studentName = "±èÃ¶¼ö";
		student.age = 20;
		student.major = "English";
		student.introduce();

		Student student1 = new Student("Yedam", "921111-1111", "¹ÚÃ¶¼ö");
		student1.introduce();
		student1.newMethod();
//		System.out.println(student.major);
//		student.doHomework();
//		System.out.println(student);
	}
}
