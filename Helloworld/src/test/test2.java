package test;

public class test2 {
	public static void main(String[] args) {
	String name = "��ö��";
	int[] value = {90,70,75};
	
	int sum = 0;
	float avg = 0f;
	
	for(int i = 0; i<value.length; i++ ) {
		sum += value[i];
	}
	double avg1 = (double)sum/value.length;
 System.out.println("�̸�: " + name);
	System.out.println("�հ� : " + sum);
	System.out.println("��� : " +Math.round((avg1) *10) / 10.0);
		
}
}