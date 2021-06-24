package in.sakthi.service;

import java.sql.SQLException;
import java.time.LocalDate;

import in.sakthi.dao.BuyChannelDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.BuyChannel;

public class BuyChannelService {
		
	public static boolean buyChannel(BuyChannel channel) {
		
		try {
			BuyChannelDao.channel(channel);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServiceException("Cannot Channel");
		}
		return true;	
		}
	
	public static boolean date(String validity) {
		boolean isValid =false;
		if(validity.equals("Monthly")) {
			Integer amount = 200;
			System.out.println("The Amount is: " +amount);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(30);
			System.out.println("The Starting Date is: " +startDate);
			System.out.println("The Expiry Date is: " +expiryDate);
		}
		else {
			Integer amount = 700;
			System.out.println("The Amount is: " +amount);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(365);
			System.out.println("The Starting Date is: " +startDate);
			System.out.println("The Expiry Date is: " +expiryDate);
		}
		return isValid;
		
	}
}
