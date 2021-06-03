package in.sakthi;

import java.sql.Connection;

import in.sakthi.util.ConnectionUtil;

public class ConnectionUtilTest {

	public static void main(String[] args) {
		
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

	}

}
