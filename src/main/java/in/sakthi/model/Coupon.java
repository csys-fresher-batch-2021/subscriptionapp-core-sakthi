package in.sakthi.model;

public class Coupon {
	
	private String name;
	private Integer age;
	private Long mobileNo;
	private Integer couponId;
	private String couponName;
	private String prize;
	
	public Coupon(String name, Integer age, Long mobileNo, Integer couponId, String couponName, String prize) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.couponId = couponId;
		this.couponName = couponName;
		this.prize = prize;
	}
	
	@Override
	public String toString() {
		return "Coupon [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", couponId=" + couponId
				+ ", couponName=" + couponName + ", prize=" + prize + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getCouponId() {
		return couponId;
	}
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
}
