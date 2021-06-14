package in.sakthi;

import java.sql.SQLException;
import java.util.List;

import in.sakthi.dao.ChannelDao;
import in.sakthi.model.Channel;
import in.sakthi.service.ChannelService;

public class TestChannelDao {

	public static void main(String[] args) throws SQLException {
   
		//List<Channel> channel = ChannelService.getList();
		
		List<Channel> channels = ChannelDao.getChannels();
		for (Channel channel1 : channels) {
			System.out.println(channel1);
		}
	}

}
