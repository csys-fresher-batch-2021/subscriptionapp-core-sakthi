package in.sakthi.service;

import java.time.LocalDate;
import in.sakthi.dao.DiscountDao;
import in.sakthi.exception.DatabaseException;
import in.sakthi.exception.ServiceException;
import in.sakthi.log.Logger;
import in.sakthi.model.Discount;

public class DiscountService {
	private DiscountService() {
		
	}
	public static boolean discount(Discount list) {
		try {
			DiscountDao.channelDiscount(list);
		} catch (DatabaseException e) {
			throw new ServiceException("Cannot Discount");
		}
		return true;
	}

	public static boolean date(String validity) {
		boolean isValid = false;
		if (validity.equals("Monthly")) {
			Integer amount = 200;
			String obj = "The amount is: " + amount;
			Logger.logger(obj);
			String obj1 = "Your Discount is 30days + Extra 3 days...";
			Logger.logger(obj1);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(33);
			String obj2 = "The Starting Date is: " + startDate;
			Logger.logger(obj2);
			String obj3 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj3);
		} else {
			Integer amount = 700;
			String obj = "The amount is: " + amount;
			Logger.logger(obj);
			String obj1 = "Your Discount is 365days + Extra 10 days...";
			Logger.logger(obj1);
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(375);
			String obj2 = "The Starting Date is: " + startDate;
			Logger.logger(obj2);
			String obj3 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj3);
		}
		return isValid;
	}
}