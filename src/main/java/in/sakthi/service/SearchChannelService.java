package in.sakthi.service;

import java.util.List;
import in.sakthi.dao.SearchChannelDao;
import in.sakthi.model.SearchChannel;

public class SearchChannelService {

	
	  private SearchChannelService() { 
		  throw new IllegalStateException("SearchChannelService"); 
	  }
	 

	/**
	 * List of subscription plan
	 * @return
	 * @throws Exception 
	 */

	public static List<SearchChannel> getSearchChannel() throws Exception {
			 try {
				return SearchChannelDao.getList();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
}