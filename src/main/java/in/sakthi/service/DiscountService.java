package in.sakthi.service;

import in.sakthi.dao.DiscountDao;
import in.sakthi.exception.DatabaseException;
import in.sakthi.exception.ServiceException;
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
}