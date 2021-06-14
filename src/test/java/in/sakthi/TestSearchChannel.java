package in.sakthi;

import java.util.List;
import in.sakthi.model.SearchChannel;
import in.sakthi.service.SearchChannelService;

public class TestSearchChannel {

	public static void main(String[] args) throws Exception {
		List<SearchChannel> searchChannels = SearchChannelService.getSearchChannel();
		for (SearchChannel channel : searchChannels) {
			System.out.println(channel);
		}
	}
}
