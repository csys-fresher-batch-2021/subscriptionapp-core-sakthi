package in.sakthi.model;

public class OnlinePayment {

	private long mobileNo;
	private long cardNo;
	private Integer pinNo;
	private Integer amount;

	public OnlinePayment(long mobileNo, long cardNo, Integer pinNo, Integer amount) {
		super();
		this.mobileNo = mobileNo;
		this.cardNo = cardNo;
		this.pinNo = pinNo;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OnlinePayment [mobileNo=" + mobileNo + ", cardNo=" + cardNo + ", pinNo=" + pinNo + ", amount=" + amount
				+ "]";
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getPinNo() {
		return pinNo;
	}

	public void setPinNo(Integer pinNo) {
		this.pinNo = pinNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
