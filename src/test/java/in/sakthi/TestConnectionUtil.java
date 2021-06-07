package in.sakthi;

import java.sql.Connection;

import org.junit.Test;

import in.sakthi.util.ConnectionUtil;

public class TestConnectionUtil {
@Test
	public static void main(String[] args) {
		
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

	}

}
