package in.sakthi.model;

public class Offer {
	private Integer channelId;
	private String channelName;
	private Integer price;
	private String validity;
	private String startDate;
	private String expiryDate;

	@Override
	public String toString() {
		return "Offer [channelId=" + channelId + ", channelName=" + channelName + ", price=" + price + ", validity="
				+ validity + ", startDate=" + startDate + ", expiryDate=" + expiryDate + "]";
	}

	public Offer(Integer channelId, String channelName, Integer price, String validity, String startDate,
			String expiryDate) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.price = price;
		this.validity = validity;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
