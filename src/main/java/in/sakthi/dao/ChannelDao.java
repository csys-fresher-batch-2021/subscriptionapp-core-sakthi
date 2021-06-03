package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.sakthi.util.ConnectionUtil;

public class ChannelDao {

	public static void main(String[] args) throws Exception {
		Integer id = 4;
		String channelName = "Netflix";
		Connection connection = null;
		PreparedStatement pst = null;
				 connection = ConnectionUtil.getConnection();
				
				String sql = "insert into channel(id,channelName) values(?,?)";
			    pst = connection.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, channelName);
				
				int rows = pst.executeUpdate();
			    System.out.println("No of Row inserted : " +rows);
			    
	 }
			    
			    public static void close (PreparedStatement pst, Connection con) throws SQLException {
					// Null Check - to avoid Null Pointer Exception
					if (pst != null) {
						pst.close();
					}
					if (con != null) {
						con.close();
					}
				}
	}




