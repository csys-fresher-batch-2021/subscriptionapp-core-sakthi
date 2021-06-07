package in.sakthi.model;

public class Channel {
	
	private Integer id;
	private String channelName;
	private Integer price;
	
	public Channel(Integer id, String channelName) {
		super();
		this.id = id;
		this.channelName = channelName;
	}
	
	@Override
	public String toString() {
		return "Channel [id=" + id + ", channelName=" + channelName + "]";
	}



	public Integer getId() {
		return id;
	}
	public String getChannelName() {
		return channelName;
	}
	

}
