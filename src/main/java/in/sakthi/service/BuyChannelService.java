package in.sakthi.service;

import java.time.LocalDate;
import in.sakthi.dao.BuyChannelDao;
import in.sakthi.exception.DatabaseException;
import in.sakthi.exception.ServiceException;
import in.sakthi.log.Logger;
import in.sakthi.model.BuyChannel;

public class BuyChannelService {

	private BuyChannelService() {

	}

	/**
	 * starting and expiry date calculate The amount is declare
	 * 
	 * @param channel
	 * @return
	 */

	public static boolean buyChannel(BuyChannel channel) {

		try {
			BuyChannelDao.channel(channel);
		} catch (DatabaseException e) {
			throw new ServiceException("Cannot Channel");
		}
		return true;
	}

	public static boolean date(String validity) {
		boolean isValid = false;
		if (validity.equals("Monthly")) {
			Integer amount = 200;
			String obj = "The amount is: " + amount;
			Logger.logger(obj);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(30);
			String obj1 = "The Starting Date is: " + startDate;
			Logger.logger(obj1);
			String obj2 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj2);
		} else if(validity.equals("Yearly"))
				{
			Integer amount = 700;
			String obj = "The amount is: " + amount;
			Logger.logger(obj);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(365);
			String obj1 = "The Starting Date is: " + startDate;
			Logger.logger(obj1);
			String obj2 = "The Expiry Date is: " + expiryDate; 
			Logger.logger(obj2);
		}
		return isValid;

	}
}