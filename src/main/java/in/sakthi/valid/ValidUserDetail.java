package in.sakthi.valid;

import in.sakthi.exception.ServiceException;
import in.sakthi.validation.UserDetailValidation;

public class ValidUserDetail {
	
	private ValidUserDetail() {
		
	}
	
	public static boolean isValidUser(String name,long mobileNo,String email)
	{
		boolean isValid = false;
		try {
			if(UserDetailValidation.isValidName(name) && UserDetailValidation.isValidMobileNo(mobileNo) && UserDetailValidation.isValidEmail(email))
			{
				isValid = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("User Details are not valid");
		}
		return isValid;
	}

}
