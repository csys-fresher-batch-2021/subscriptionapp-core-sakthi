package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.sakthi.exception.DatabaseException;
import in.sakthi.model.OnlinePayment;
import in.sakthi.util.ConnectionUtil;

public class OnlinePaymentDao {
	
	private OnlinePaymentDao() {
		
	}

	public static void payment(OnlinePayment pay) {
		Connection con = null;
		PreparedStatement pst = null;
			try {
				Connection connection = ConnectionUtil.getConnection();
				String sql = "insert into onlinepayment(mobile_no,card_no,pin_no,amount) values(?,?,?,?)";
				pst = connection.prepareStatement(sql);
				pst.setLong(1, pay.getMobileNo());
				pst.setLong(2, pay.getCardNo());
				pst.setInt(3, pay.getPinNo());
				pst.setInt(4, pay.getAmount());
				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DatabaseException("Unable Payment Details");
			}
			finally {
				ConnectionUtil.close(pst, con);
			}

	}

}
