package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.sakthi.service.ChannelService;
import in.sakthi.util.ConnectionUtil;

public class ChannelDao {
	
	/**
	 * List store the database 
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
				 connection = ConnectionUtil.getConnection();
				ChannelService.getChannels();
				String sql = "select * from channel";
			    pst = connection.prepareStatement(sql);
			    
	}

	public static void close (PreparedStatement pst, Connection con) throws SQLException {
					if (pst != null) {
						pst.close();
					}
					if (con != null) {
						con.close();
					}
				}
	}




