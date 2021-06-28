package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.sakthi.exception.DatabaseException;
import in.sakthi.model.Discount;
import in.sakthi.util.ConnectionUtil;

public class DiscountDao {
	private DiscountDao() {
		
	}
	public static void channelDiscount(Discount list) throws DatabaseException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into discountchannel(channel_name,validity) values(?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, list.getChannelName());
			pst.setString(2, list.getValidity());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DatabaseException("unable user detail");
		} finally {
			ConnectionUtil.close(pst, con);
		}
	}
}
