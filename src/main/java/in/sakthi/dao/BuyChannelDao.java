package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.sakthi.exception.DatabaseException;
import in.sakthi.model.BuyChannel;
import in.sakthi.util.ConnectionUtil;

public class BuyChannelDao {
	
	public static void channel(BuyChannel channel) throws SQLException {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into pay(channel_name,channel_id,validity) values (?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1,channel.getChannelName());
			pst.setInt(2, channel.getChannelId());
			pst.setString(3, channel.getValidity());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DatabaseException("unable user detail");
		}
		finally {
			ConnectionUtil.close(pst, con);
		}
 }

}
