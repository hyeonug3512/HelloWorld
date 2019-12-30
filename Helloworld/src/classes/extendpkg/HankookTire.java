package classes.extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false;
		}
	}

}
