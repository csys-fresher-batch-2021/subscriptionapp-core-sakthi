package in.sakthi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	public static List<SearchChannel> getList() throws Exception{
		try {
			Connection connection = ConnectionUtil.getConnection();
			Statement pst;
			pst = connection.createStatement();
			String sql = "select channelName,channelId,planName,price,validity from searchChannel";
			ResultSet rst;
			rst = pst.executeQuery(sql);
			List<SearchChannel> searchChannels = new ArrayList<>();
			while (rst.next()) {
				SearchChannel Channel = new SearchChannel(rst.getString("channelName"), rst.getInt("channelId"),
						rst.getString("planName"), rst.getInt("price"), rst.getString("validity"));
				searchChannels.add(Channel);
			}
			return searchChannels;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
