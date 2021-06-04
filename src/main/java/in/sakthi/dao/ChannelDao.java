package in.sakthi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.sakthi.model.Channel;
import in.sakthi.util.ConnectionUtil;

public class ChannelDao {

	/**
	 * List store the database 
	 * @param args
	 * @throws SQLException 
	 * @throws Exception
	 */
	public static List<Channel> getChannels() throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		Statement pst;
		pst = connection.createStatement();
		String sql = "select * from channel";
		ResultSet rst;
		rst = pst.executeQuery(sql);
		List<Channel> channels = new ArrayList<>();
		while (rst.next()) {
			Channel channel = new Channel(rst.getInt("id"), rst.getString("channelName"));
			channels.add(channel);
		}
		return channels;

	}

	public static void close(Statement pst, Connection connection) throws SQLException {
		try {
			if (pst != null) {
				pst.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
