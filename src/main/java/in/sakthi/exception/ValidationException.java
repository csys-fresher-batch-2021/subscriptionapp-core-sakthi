package in.sakthi.exception;

public class ValidationException extends RuntimeException {

	/**
	 * Exception handle the validation
	 */

	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		super(message);

	}
}
