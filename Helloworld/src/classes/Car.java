package classes;

public class Car {
	private String company = "현대자동차";
	private String model = "그랜져";
	private String color = "검정";
	private int speed = 60;
	private int maxSpeed = 350;
	int r;

	Car() {
	}

	Car(String company) {
		this.company = company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	double getArea() {
		if (this.r > 0) {
			double result = 3.14 * this.r * this.r;
		} else {
			return 0;
		}
		

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public String getCompany() {
		return company;
	}
}
