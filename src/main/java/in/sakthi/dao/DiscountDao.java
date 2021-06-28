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

	/**
	 * Store the datebase in channelName,validity,amount
	 * 
	 * @param list
	 * @throws DatabaseException
	 */
	public static void channelDiscount(Discount list) throws DatabaseException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into discountlist(channel_name,validity,amount) values(?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, list.getChannelName());
			pst.setString(2, list.getValidity());
			pst.setInt(3, list.getAmount());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DatabaseException("unable user detail");
		} finally {
			ConnectionUtil.close(pst, con);
		}
	}
}
