package in.sakthi.service;

import in.sakthi.dao.OnlinePaymentDao;
import in.sakthi.exception.ValidationException;
import in.sakthi.model.OnlinePayment;
import in.sakthi.validation.OnlinePaymentValidation;

public class ValidOnlinePayment {

	private ValidOnlinePayment() {

	}

	/**
	 * The validation are true
	 * 
	 * @param mobileNo
	 * @param cardNo
	 * @param pinNo
	 * @param pay
	 * @return
	 */

	public static boolean isValidOnlinePayment(long mobileNo, long cardNo, int pinNo, OnlinePayment pay) {
		boolean isValid = false;
		try {
			if (OnlinePaymentValidation.isValidMobileNo(mobileNo) && OnlinePaymentValidation.isValidCardNo(cardNo)
					&& OnlinePaymentValidation.isValidPinNo(pinNo)) {
				isValid = true;
				OnlinePaymentDao.payment(pay);

			}
		} catch (Exception e) {
			throw new ValidationException("TheDetails are Invalid");
		}
		return isValid;
	}

}
