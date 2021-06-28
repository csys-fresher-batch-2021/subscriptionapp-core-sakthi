package in.sakthi.service;

import in.sakthi.dao.OnlinePaymentDao;
import in.sakthi.exception.ServiceException;
import in.sakthi.model.OnlinePayment;
import in.sakthi.validation.OnlinePaymentValidation;

public class OnlinePaymentService {
	private OnlinePaymentService() {

	}

	public static boolean isValidOnlinePayment(long mobileNo, long cardNo, int pinNo, OnlinePayment pay) {
		boolean isValid = false;
		try {
			if (OnlinePaymentValidation.isValidMobileNo(mobileNo) && OnlinePaymentValidation.isValidCardNo(cardNo)
					&& OnlinePaymentValidation.isValidPinNo(pinNo)) {
				isValid = true;
				OnlinePaymentDao.payment(pay);
			}
		} catch (Exception e) {
			throw new ServiceException("The Details are Invalid");
		}
		return isValid;
	}

}
