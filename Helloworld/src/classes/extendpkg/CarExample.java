package classes.extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 교체.");
				car.tires[0] = new HankookTire("앞왼쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽 교체.");
				car.tires[1] = new KumhoTire("앞오른쪽", 11);
				break;
			case 3:
				System.out.println("뒤왼쪽 교체.");
				car.tires[2] = new HankookTire("뒤왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤오른쪽 교체.");
				car.tires[3] = new KumhoTire("뒤오른쪽", 12);
				break;
			}
			System.out.println("----------------------------");
		}
	}
}
