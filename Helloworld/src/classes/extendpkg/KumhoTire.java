package classes.extendpkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire ��ũ ***");
			return false;
		}
	}

}
