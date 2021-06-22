package in.sakthi.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailValidation {
	
	private UserDetailValidation() {
	}
	
	public static boolean isValidName(String name)
	{
		boolean isValid = false;
		String regex = "^[a-zA-Z]{3,12}";
		if (UserSetValidation.isEmptyString(name)) {
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(name);

			isValid = match.matches();
		}
		return isValid;

	}
	public static boolean isValidMobileNo(long mobileNo)
	{
		boolean isValid = false;
		String number = String.valueOf(mobileNo);
		String regex = "^[0-9]{10}$";
		if(UserSetValidation.isEmptyString(number))
		{
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(number);

			isValid = match.matches();
		}
		return isValid;
	}
	    
	public static boolean isValidEmail(String email) {
		boolean isValid = false;
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		if(UserSetValidation.isEmptyString(email)) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(email);
		isValid = match.matches();
		}
		return isValid;
	}
}
