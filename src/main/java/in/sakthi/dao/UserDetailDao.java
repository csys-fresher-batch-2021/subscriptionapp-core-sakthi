package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.sakthi.exception.DatabaseException;
import in.sakthi.model.UserDetail;
import in.sakthi.util.ConnectionUtil;

public class UserDetailDao {

	private UserDetailDao() {
	}

	/**
	 * storing the User details in database
	 * 
	 * @param reg
	 * @throws SQLException
	 */

	public static void register(UserDetail reg) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into register(name,mobileNo,email) values (?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, reg.getName());
			pst.setLong(2, reg.getMobileNo());
			pst.setString(3, reg.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DatabaseException("unable user detail");
		} finally {
			ConnectionUtil.close(pst, con);
		}
	}
}
