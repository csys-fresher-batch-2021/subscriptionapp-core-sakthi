package in.sakthi;

import java.sql.SQLException;
import java.util.List;

import in.sakthi.dao.ChannelDao;
import in.sakthi.model.Channel;

public class TestChannelDao {

	public static void main(String[] args) throws SQLException {

		List<Channel> channels = ChannelDao.getChannels();
		for (Channel channel : channels) {
			System.out.println(channel);
		}
	}

}
