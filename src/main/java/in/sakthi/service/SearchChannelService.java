package in.sakthi.service;

public class SearchChannelService {

	String channelName;
	Integer channelId;
	String planName;
	Integer price;
	String validity;

	public void insert(String n, Integer i, String p, Integer r, String v) {
		channelName = n;
		channelId = i;
		planName = p;
		price = r;
		validity = v;
	}

	public void display() {
		System.out.println("The Channel Package is: " + "[" + "Name:" + channelName + ", " + "Id:" + channelId + ", "
				+ "Plan:" + planName + " ," + "Price:" + price + " ," + "Validity:" + validity + "]");
	}
}