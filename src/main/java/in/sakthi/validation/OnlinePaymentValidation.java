package in.sakthi.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import in.sakthi.log.Logger;

public class OnlinePaymentValidation {
	private OnlinePaymentValidation() {

	}

	/**
	 * validation of mobileNo,cardNo,pinNo
	 * 
	 * @param name
	 * @return
	 */

	public static boolean isEmptyString(String name) {
		boolean isValid = false;

		if (!(name.trim().equals(""))) {
			isValid = true;

		}
		return isValid;
	}

	public static boolean isValidMobileNo(long mobileNo) {
		boolean isValid = false;
		String mobileNumber = Long.toString(mobileNo);
		String regex = "^[0-9]{10}$";
		if (OnlinePaymentValidation.isEmptyString(mobileNumber)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(mobileNumber);
			isValid = match.matches();
		}
		return isValid;
	}

	public static boolean isValidCardNo(long cardNo) {
		String num = String.valueOf(cardNo);
		boolean isValid = false;
		if (num.length() == 16) {
			String obj = "The Card is Valid...";
			Logger.logger(obj);
			isValid = true;
		} else {
			String obj = "The Card is Invalid credentials...";
			Logger.logger(obj);
		}
		return isValid;
	}

	public static boolean isValidPinNo(int pinNo) {
		String num = String.valueOf(pinNo);
		boolean isValid = false;
		if (num.length() == 4) {
			String obj = "The Pin No is Valid...";
			Logger.logger(obj);
			isValid = true;
		} else {
			String obj = "The Pin No is Invalid credentials...";
			Logger.logger(obj);
		}
		return isValid;
	}
}
