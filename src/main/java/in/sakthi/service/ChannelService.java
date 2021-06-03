package in.sakthi.service;

import java.util.HashMap;
public class ChannelService {
	
	private static final HashMap<Integer, String> channels = new HashMap<Integer, String>();
	static
	{
	channels.put(1,"TvShows");
	channels.put(2,"Sports");
	channels.put(3,"Movies");
	channels.put(4, "News");
	System.out.println("The channel List is: "+channels);
}
public static HashMap<Integer,String> getChannels()
{
	return channels;
}
}