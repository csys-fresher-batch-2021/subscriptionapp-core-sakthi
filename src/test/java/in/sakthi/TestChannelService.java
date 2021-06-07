package in.sakthi;

import java.sql.SQLException;
import java.util.List;

import in.sakthi.model.Channel;
import in.sakthi.service.ChannelService;

public class TestChannelService {

	public static void main(String[] args) throws SQLException {
		
		List<Channel> channel = ChannelService.getList();
		System.out.println();
      
	}

}
