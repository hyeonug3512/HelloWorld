package classes.extendpkg;

public class Car {
//	Tire frontLeft = new Tire("�տ���", 6);
//	Tire frontRight = new Tire("�տ�����", 3);
//	Tire backLeft = new Tire("�ڿ���", 3);
//	Tire backRight = new Tire("�ڿ�����", 4);
	Tire[] tires = { new Tire("�տ���", 6), new Tire("�տ�����", 3), new Tire("�ڿ���", 3), new Tire("�ڿ�����", 4) };

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}

	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return i +1;
			}
		}
		return 0;
	}

}
