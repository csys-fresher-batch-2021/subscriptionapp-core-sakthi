package in.sakthi.model;

public class SearchChannel {

	private String channelName;
	private Integer channelId;
	private String planName;
	private Integer price;
	private String validity;

	public SearchChannel(String channelName, Integer channelId, String planName, Integer price, String validity) {
		super();
		this.channelName = channelName;
		this.channelId = channelId;
		this.planName = planName;
		this.price = price;
		this.validity = validity;
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

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
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

	@Override
	public String toString() {
		return "SearchChannel [channelName=" + channelName + ", channelId=" + channelId + ", planName=" + planName
				+ ", price=" + price + ", validity=" + validity + "]";
	}
}
