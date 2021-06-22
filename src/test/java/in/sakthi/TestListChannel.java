package in.sakthi;
import in.sakthi.model.pack;
import in.sakthi.service.name;

import java.sql.SQLException;
import java.util.List;
public abstract class TestListChannel {

	public static void main(String[] args) throws SQLException {
		
		List<pack> lists = name.getChannels();
		for(pack channels : lists)
		{
			System.out.println(channels);
		}

	}

}
