package classes;

class Calculators {
	static double PI= 3.14159;//�������� �빮��, �δܾ� �̻�
	//EARTH_AREA = 6593902394;
	String color;
	
	void setColor(String color) {
		this.color = color;
	}
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int a, int b) {
		return a-b;
	}
}

public class ClaculatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		cal.color = "White";
		cal.setColor("black"); //�ν��Ͻ��޼ҵ�� �ݵ�� �ν��Ͻ� ���� �Ŀ� ����ؾ� ��
		
		cal.plus(4, 5);
		
		Calculators.plus(6, 7); //����(static)�޼ҵ�� Ŭ������.�޼ҵ�
	}
}


