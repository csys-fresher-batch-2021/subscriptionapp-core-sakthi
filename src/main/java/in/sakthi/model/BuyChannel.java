package in.sakthi.model;

import java.time.LocalDate;

public class BuyChannel {
	private String channelName;
	private Integer channelId;
	private String validity;
	private Integer amount;
	private LocalDate startDate;
	private LocalDate expiryDate;

	public BuyChannel(String channelName, Integer channelId, String validity, Integer amount, LocalDate startDate,
			LocalDate expiryDate) {
		super();
		this.channelName = channelName;
		this.channelId = channelId;
		this.validity = validity;
		this.amount = amount;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
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

	@Override
	public String toString() {
		return "BuyChannel [channelName=" + channelName + ", channelId=" + channelId + ", validity=" + validity
				+ ", amount=" + amount + ", startDate=" + startDate + ", expiryDate=" + expiryDate + "]";
	}

	public static BuyChannel getInstance() {
		return null;
	}

}