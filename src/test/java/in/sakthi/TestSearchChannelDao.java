package in.sakthi;

import in.sakthi.dao.SearchChannelDao;

public class TestSearchChannelDao {

	public static void main(String[] args) throws Exception {
		

		Integer price = 500;
		String channelName = "Hotstar VIP";
		String planName = "Monthly";
		String validity = "30days";
		Integer channelId = 103;
		SearchChannelDao.save(channelName,channelId,planName,price,validity);

	}

}
