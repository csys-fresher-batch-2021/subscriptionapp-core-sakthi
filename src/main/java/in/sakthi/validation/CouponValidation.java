package in.sakthi.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CouponValidation {
	private CouponValidation() {

	}

	/**
	 * Validate the name,age,mobileno,couponname,prize
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

	public static boolean isValidName(String name) {
		boolean isValid = false;
		String regex = "^[a-zA-Z]{3,15}";
		if (CouponValidation.isEmptyString(name)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(name);
			isValid = match.matches();
		}
		return isValid;
	}

	public static boolean isValidAge(int age) {
		boolean isValid = false;
		if (age > 0 && age <= 100) {
			isValid = true;
		}
		return isValid;
	}

	public static boolean isValidMobileno(long mobileNo) {
		boolean isValid = false;
		String mobileNumber = Long.toString(mobileNo);
		String regex = "^[0-9]{10}$";
		if (CouponValidation.isEmptyString(mobileNumber)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(mobileNumber);
			isValid = match.matches();
		}
		return isValid;
	}

	public static boolean isValidcouponName(String couponName) {
		boolean isValid = false;
		String regex = "^[a-zA-Z]{3,12}";
		if (CouponValidation.isEmptyString(couponName)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(couponName);
			isValid = match.matches();
		}
		return isValid;
	}

	public static boolean isValidPrize(String prize) {
		boolean isValid = false;
		String regex = "^[a-zA-Z]{3,12}";
		if (CouponValidation.isEmptyString(prize)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(prize);
			isValid = match.matches();
		}
		return isValid;
	}
}
