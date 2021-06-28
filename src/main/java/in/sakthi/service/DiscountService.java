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
	public static int date(Integer amount,String validity) {
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
		} else if(validity.equals("Yearly")) {
			percentage = 2;
			discount = amount - amount * percentage / 100;
			LocalDate startDate = LocalDate.now();
			LocalDate expiryDate = startDate.plusDays(365);
			String obj = "The Starting Date is: " + startDate;
			Logger.logger(obj);
			String obj1 = "The Expiry Date is: " + expiryDate;
			Logger.logger(obj1);
		}
		System.out.println("The Discount is " + percentage + "% for your Purchase...");
		System.out.println("The Amount is : " + amount);
		System.out.println("The Discount Amount is: " + discount);
		return amount;
	}
}