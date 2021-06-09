package in.sakthi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.sakthi.util.ConnectionUtil;

public class SearchChannelDao {
	
	private SearchChannelDao() {
		throw new IllegalStateException("SearchChannelDao");
	}
	
	public static void save(String channelName,Integer channelId,String planName,Integer price,String validity) throws Exception
	{
	    Connection connection = null;
	    PreparedStatement pst = null;
		
	    try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into searchChannel(channelName,channelId,planName,price,validity) values ( ?,?,?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, channelName);
			pst.setInt(2,channelId);
			pst.setString(3,planName);
			pst.setInt(4, price);
			pst.setString(5, validity);
			
			int rows = pst.executeUpdate();
			boolean inserted = rows == 1 ? true : false;
			System.out.println("No of rows inserted :" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to add product");
		}
	    finally {
	    ConnectionUtil.close(pst, connection);
	    }
	}

}
