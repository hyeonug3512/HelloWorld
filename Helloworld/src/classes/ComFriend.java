package classes;

public class ComFriend extends Friend {
	private String company;
	private String dept;
	
	
	ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "ComFriend [company=" + company + ", dept=" + dept + "]";
	}
	
	@Override
	public void introduce() {
		System.out.println(" �̸���: " + super.getName() + 
							" ����ó��: " + super.getPhone() + 
							" ȸ��: " +company + " �μ���: "+ dept);
	}

	

}
