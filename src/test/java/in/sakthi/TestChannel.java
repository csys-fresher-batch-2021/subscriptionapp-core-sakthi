package in.sakthi;
import java.sql.SQLException;

import org.junit.Test;

import in.sakthi.service.ChannelService;

public class TestChannel {

	@Test
	public void testcase() throws SQLException  {
		ChannelService.getChannels();
		assert true;
		}

}
