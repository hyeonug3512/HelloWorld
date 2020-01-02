package test;

public class Swimming {
	String memberId;
    String name;
	 String phone;

	public Swimming() {}

	public Swimming(String memberId, String name, String phone) {
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	@Override
	public String toString() {
		return "Swimming [memberId=" + memberId + ", name=" + name + ", phone=" + phone + "]";
	}

	public void introduce() {
		System.out.println("아이디는: " + memberId + " 이름은: " + name + " 연락처는: " + phone);
	}
}
