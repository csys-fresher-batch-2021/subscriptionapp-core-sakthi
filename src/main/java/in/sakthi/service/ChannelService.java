package in.sakthi.service;

import java.sql.SQLException;
import java.util.List;

import in.sakthi.dao.ChannelDao;
import in.sakthi.model.Channel;

public class ChannelService {

	private ChannelService() {
		throw new IllegalStateException("ChannelService");
	}

	/**
	 * List of Channels
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Channel> getList() throws SQLException {
		try {
			return ChannelDao.getChannels();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
