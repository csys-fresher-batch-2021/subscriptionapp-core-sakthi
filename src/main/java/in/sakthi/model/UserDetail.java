package in.sakthi.model;

public class UserDetail {

	private String name;
	private long mobileNo;
	private String email;

	public UserDetail(String name, long mobileNo, String email) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
