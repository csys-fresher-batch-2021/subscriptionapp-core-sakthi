package in.sakthi.model;

import java.time.LocalDate;

public class Discount {
	private String channelName;
	private String validity;
	private Integer amount;
	private LocalDate startDate;
	private LocalDate expiryDate;

	public Discount(String channelName, String validity) {
		super();
		this.channelName = channelName;
		this.validity = validity;
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

	public static Discount getInstance() {
		return null;
	}
}
