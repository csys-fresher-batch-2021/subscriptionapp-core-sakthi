package in.sakthi;

import in.sakthi.model.BuyChannel;
import in.sakthi.service.BuyChannelService;

public class TestBuyChannel {

	public static void main(String[] args) {

		String channelName = "Hotstar";
		Integer channelId = 101;
		String validity = "Monthly";

		BuyChannel channel = new BuyChannel(channelName, channelId, validity);
		BuyChannelService.buyChannel(channel);
		BuyChannelService.date(validity);
	}
}
