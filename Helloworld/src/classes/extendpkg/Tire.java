package classes.extendpkg;

public class Tire {
		int maxRotation;//��밡���� ȸ����(10)
		int accumulateRotation;//������� ����� ȸ�� �� 
		String location; //������ġ..�տ�,�տ�, �ڿ�, �ڿ�
		
		public Tire(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}
		
		public boolean roll() {
			++accumulateRotation;
			if(accumulateRotation < maxRotation) {
				System.out.println(location + " Tire ����: " 
						+(maxRotation - accumulateRotation));
				return true;
			}else {
				System.out.println("***" + location + "Tire ��ũ ***");
				return false;
			}
		}
}
