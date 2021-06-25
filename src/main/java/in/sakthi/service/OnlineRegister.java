package in.sakthi.service;

import in.sakthi.dao.OnlinePaymentDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.OnlinePayment;

public class OnlineRegister {

	private OnlineRegister() {

	}

	/**
	 * The register payment is get the Dao
	 * 
	 * @param payobj
	 * @return
	 */
	public static boolean registerPayment(OnlinePayment payobj) {
		try {
			OnlinePaymentDao.payment(payobj);
		} catch (Exception e) {
			throw new ServiceException("Cannot Payment");
		}

		return true;
	}
}
