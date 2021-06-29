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

	/**
	 * The starting and expiry date is calculated
	 * 
	 * @param list
	 * @return
	 */
	public static boolean discount(Discount list) {
		try {
			DiscountDao.channelDiscount(list);
		} catch (DatabaseException e) {
			throw new ServiceException("Cannot Discount");
		}
		return true;
	}

	public static int date(Integer amount, String validity) {
		int discount = 0;
		int percentage = 0;
		if (amount <= 200 && validity.equals("Monthly")) {
			percentage = 1;
			discount = amount - amount * percentage / 100;
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(30);
			String obj = "The Starting Date is: " + startDate;
			Logger.logger(obj);
			String obj1 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj1);
		} else if (validity.equals("Yearly")) {
			percentage = 2;
			discount = amount - amount * percentage / 100;
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(365);
			String obj = "The Starting Date is: " + startDate;
			Logger.logger(obj);
			String obj1 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj1);
		}
		String obj = ("The Discount is " + percentage + "% for your Purchase...");
		Logger.logger(obj);
		String obj1 = ("The Amount is : " + amount);
		Logger.logger(obj1);
		String obj2 = ("The Discount Amount is: " + discount);
		Logger.logger(obj2);
		return amount;
	}
}