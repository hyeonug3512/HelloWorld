package classes.extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� ��ü.");
				car.tires[0] = new HankookTire("�տ���", 10);
				break;
			case 2:
				System.out.println("�տ����� ��ü.");
				car.tires[1] = new KumhoTire("�տ�����", 11);
				break;
			case 3:
				System.out.println("�ڿ��� ��ü.");
				car.tires[2] = new HankookTire("�ڿ���", 13);
				break;
			case 4:
				System.out.println("�ڿ����� ��ü.");
				car.tires[3] = new KumhoTire("�ڿ�����", 12);
				break;
			}
			System.out.println("----------------------------");
		}
	}
}
