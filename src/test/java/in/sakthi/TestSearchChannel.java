package in.sakthi;

import in.sakthi.service.SearchChannelService;

public class TestSearchChannel {

	public static void main(String[] args) throws Exception {

		SearchChannelService myChannel1 = new SearchChannelService();
		myChannel1.insert("Hotstar", 101, "Monthly", 300, "30days");
		myChannel1.display();

	}
}
