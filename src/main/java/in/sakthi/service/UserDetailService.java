package in.sakthi.service;

import in.sakthi.model.UserDetail;
import in.sakthi.valid.ValidUserDetail;

public class UserDetailService {

	private UserDetailService() {
		throw new IllegalStateException("UserDetailService");
	}

	/**
	 * checking the validation in name,mobileNo and email
	 * 
	 * @param name
	 * @param mobileNo
	 * @param email
	 * @return
	 */

	public static boolean checkUserDetail(String name, long mobileNo, String email) {
		boolean isValid = false;
		UserDetail reg = new UserDetail(name, mobileNo, email);
		boolean isRegister = ValidUserDetail.isValidUser(name, mobileNo, email);
		if (isRegister) {
			RegisterService.registerUser(reg);
			isValid = true;
		}
		return isRegister;
	}

}
