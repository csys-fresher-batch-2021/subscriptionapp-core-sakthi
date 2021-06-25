package in.sakthi.service;

import java.sql.SQLException;
import in.sakthi.dao.OnlinePaymentDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.OnlinePayment;
import in.sakthi.valid.ValidOnlinePayment;

public class OnlinePaymentService {
	
	public static boolean checkOnlinePayment(long mobileNo,long cardNo,int pinNo) throws ServiceException, SQLException
	{
		boolean isValid = false;
		OnlinePayment pay = new OnlinePayment(mobileNo,cardNo, pinNo, null);
		boolean isRegister = ValidOnlinePayment.isValidOnlinePayment(mobileNo, cardNo, pinNo);
		if(isRegister) {
			OnlineRegister.registerPayment(pay);
			isValid = true;
		}
		return isRegister;
	}
		
	}
