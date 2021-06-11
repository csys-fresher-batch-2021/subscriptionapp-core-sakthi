package in.sakthi;

import java.util.List;
import in.sakthi.model.SearchChannel;
import in.sakthi.service.SearchChannelService;

public class TestSearchChannel {

	public static void main(String[] args) throws Exception {
		String channelName = "Hotstar";
		List<SearchChannel> searchChannels = SearchChannelService.getSearchChannel(channelName);
		for (SearchChannel channels : searchChannels) {
			System.out.println(channels);
		}
	}
}
