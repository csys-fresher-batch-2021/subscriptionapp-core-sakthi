package in.sakthi.validation;

public class UserSetValidation {

	private UserSetValidation() {

	}

	public static boolean isEmptyString(String name) {
		boolean isValid = false;

		if (!(name.trim().equals(""))) {
			isValid = true;

		}
		return isValid;
	}
}
