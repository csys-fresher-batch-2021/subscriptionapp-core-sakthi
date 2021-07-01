package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.sakthi.exception.DatabaseException;
import in.sakthi.model.Coupon;
import in.sakthi.util.ConnectionUtil;

public class CouponDao {
	private CouponDao() {

	}

	/**
	 * All details are stored in database
	 * 
	 * @param coupon
	 * @throws SQLException
	 */
	public static void couponRegister(Coupon coupon) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into couponlist(name,age,mobile_no,coupon_id,coupon_name,prize) values (?,?,?,?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, coupon.getName());
			pst.setInt(2, coupon.getAge());
			pst.setLong(3, coupon.getMobileNo());
			pst.setInt(4, coupon.getCouponId());
			pst.setString(5, coupon.getCouponName());
			pst.setString(6, coupon.getPrize());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DatabaseException("unable to coupon details");
		} finally {
			ConnectionUtil.close(pst, con);
		}
	}
}
