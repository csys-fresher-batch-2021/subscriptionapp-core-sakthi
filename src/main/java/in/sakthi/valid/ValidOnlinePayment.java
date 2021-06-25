package in.sakthi.valid;

import in.sakthi.exception.ValidationException;
import in.sakthi.validation.OnlinePaymentValidation;

public class ValidOnlinePayment {

	public static boolean isValidOnlinePayment(long mobileNo, long cardNo, int pinNo) {
		boolean isValid = false;
		try {
			if (OnlinePaymentValidation.isValidMobileNo(mobileNo) && OnlinePaymentValidation.isValidCardNo(cardNo)
					&& OnlinePaymentValidation.isValidPinNo(pinNo)) {
				isValid = true;
			}
		} catch (Exception e) {
			throw new ValidationException("TheDetails are Invalid");
		}
		return isValid;
	}

}
