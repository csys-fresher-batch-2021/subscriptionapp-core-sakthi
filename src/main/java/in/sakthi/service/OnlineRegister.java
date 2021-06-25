package in.sakthi.service;

import java.sql.SQLException;

import in.sakthi.dao.OnlinePaymentDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.OnlinePayment;

public class OnlineRegister {
	
	public static boolean registerPayment(OnlinePayment payobj)
	{
				try {
					OnlinePaymentDao.payment(payobj);
				} catch (Exception e) {
					e.printStackTrace();
					throw new ServiceException("Cannot Payment");
				}
			
		return true; 
	}
}
