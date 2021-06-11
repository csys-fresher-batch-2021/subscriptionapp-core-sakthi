package in.sakthi.service;

import java.sql.SQLException;
import java.util.List;

import in.sakthi.dao.SearchChannelDao;
import in.sakthi.model.SearchChannel;

public class SearchChannelService {

	private SearchChannelService() {
		throw new IllegalStateException("SearchChannelService");
	}

	/**
	 * List of Subscription plan
	 * 
	 * @param channelName
	 * @return
	 * @throws Exception
	 */

	public static List<SearchChannel> getSearchChannel(String channelName) throws Exception {
		if (channelName.equals("Hotstar")) {
			try {
				return SearchChannelDao.getList();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("The Channel is not required...");
		}
		return null;
	}
}