package in.sakthi;

import java.sql.SQLException;

import in.sakthi.dao.SearchChannelDao;
import in.sakthi.service.SearchChannelService;

public class TestSearchChannel {

	public static void main(String[] args) throws Exception {

		SearchChannelService myChannel1 = new SearchChannelService();
		myChannel1.insert("Hotstar", 101, "Monthly", 300, "30days");
		myChannel1.display();
		
		Integer price = 500;
		String channelName = "Hotstar VIP";
		String planName = "Monthly";
		String validity = "30days";
		Integer channelId = 103;
		SearchChannelDao.save(channelName,channelId,planName,price,validity);
		//System.out.println("The package is: "+searchChannel);
	}
}
