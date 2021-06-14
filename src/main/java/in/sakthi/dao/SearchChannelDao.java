package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import in.sakthi.model.SearchChannel;
import in.sakthi.util.ConnectionUtil;

public class SearchChannelDao {

	  private SearchChannelDao() { 
		  throw new IllegalStateException("SearchChannelDao");
	  }
	
	  /*
	 * List of subscription Planning
	 *  Connect to the database
	 */

	public static List<SearchChannel> getList() throws SQLException {
	   List<SearchChannel> searchChannels = new ArrayList<>();
	   Connection con = null;
	   PreparedStatement pst = null;
	   ResultSet rst = null;
			try {
				Connection connection= ConnectionUtil.getConnection();
				String sql = "select channelName,channelId,planName,price,validity from searchChannel";
				pst = connection.prepareStatement(sql);
				rst = pst.executeQuery();
				while (rst.next()) {
					String channelName = rst.getString("channelName");
					int channelId = rst.getInt("channelId");
					String planName = rst.getString("planName");
					int price = rst.getInt("price");
					String validity = rst.getString("validity");
					SearchChannel channel = new SearchChannel(channelName,channelId,planName,price,validity);
					searchChannels.add(channel);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally
			{
				ConnectionUtil.close1(rst, pst, con);
			}
			return searchChannels;
		} 
}

