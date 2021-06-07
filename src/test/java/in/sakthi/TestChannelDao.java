package in.sakthi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import in.sakthi.dao.ChannelDao;
import in.sakthi.model.Channel;

public class TestChannelDao {

	public static void main(String[] args) throws SQLException {
		
		List<Channel> channels = ChannelDao.getChannels();
		for(Channel channel : channels) {
			System.out.println(channel);
		}
	}

		public static void close(Statement pst, Connection Connection) throws SQLException {
			try {
				if (pst != null) {
					pst.close();
				}
				if (Connection != null) {
					Connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

