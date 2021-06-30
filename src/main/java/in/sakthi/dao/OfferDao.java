package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import in.sakthi.exception.DatabaseException;
import in.sakthi.model.Offer;
import in.sakthi.util.ConnectionUtil;

public class OfferDao {
	private OfferDao() {

	}

	/**
	 * Store the database in offer detail
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Offer> getAllOffer() throws SQLException {
		List<Offer> offerList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select channel_id,channel_name,validity,price,start_date,expiry_date from offerlist";
			pst = connection.prepareStatement(sql);
			rst = pst.executeQuery();
			while (rst.next()) {
				Integer channelId = rst.getInt("channel_id");
				String channelName = rst.getString("channel_name");
				String validity = rst.getString("validity");
				Integer price = rst.getInt("price");
				String startDate = rst.getString("start_date");
				String expiryDate = rst.getString("expiry_date");
				Offer listOffer = new Offer(channelId, channelName, price, validity, startDate, expiryDate);
				offerList.add(listOffer);
			}
		} catch (SQLException e) {
			throw new DatabaseException("Unable to Offer List");
		} finally {
			ConnectionUtil.close1(rst, pst, con);
		}
		return offerList;
	}
}
