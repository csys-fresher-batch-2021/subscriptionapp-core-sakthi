package in.sakthi.model;

import java.time.LocalDate;

public class Discount {
	private String channelName;
	private String validity;
	private Integer amount;
	private Integer discountPrice;
	private Integer percentage;
	private LocalDate startDate;
	private LocalDate expiryDate;

	public Discount(String channelName, String validity,Integer amount) {
		super();
		this.channelName = channelName;
		this.validity = validity;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Discount [channelName=" + channelName + ", validity=" + validity + ", amount=" + amount + ", startDate="
				+ startDate + ", expiryDate=" + expiryDate + "]";
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer getDiscount() {
		return discountPrice;
	}

	public void setDiscount(Integer discount) {
		this.discountPrice = discount;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
}
