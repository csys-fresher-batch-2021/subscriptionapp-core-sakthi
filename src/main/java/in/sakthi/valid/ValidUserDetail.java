package in.sakthi.valid;

import in.sakthi.exception.ServiceException;
import in.sakthi.validation.UserDetailValidation;

public class ValidUserDetail {

	private ValidUserDetail() {

	}

	/**
	 * Validation of name,mobileNo,email
	 * 
	 * @param name
	 * @param mobileNo
	 * @param email
	 * @return
	 */

	public static boolean isValidUser(String name, long mobileNo, String email) {
		boolean isValid = false;
		try {
			if (UserDetailValidation.isValidName(name) && UserDetailValidation.isValidMobileNo(mobileNo)
					&& UserDetailValidation.isValidEmail(email)) {
				isValid = true;
			}
		} catch (Exception e) {
			throw new ServiceException("User Details are not valid");
		}
		return isValid;
	}

}
