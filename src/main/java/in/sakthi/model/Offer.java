package in.sakthi.model;

public class Offer {
	private String channelName;
	private Integer price;
	private String validity;
	private String startDate;
	private String expiryDate;

	public Offer(String channelName, Integer price, String validity, String startDate,
			String expiryDate) {
		super();
		this.channelName = channelName;
		this.price = price;
		this.validity = validity;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Offer [ channelName=" + channelName + ", price=" + price + ", validity="
				+ validity + ", startDate=" + startDate + ", expiryDate=" + expiryDate + "]";
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
