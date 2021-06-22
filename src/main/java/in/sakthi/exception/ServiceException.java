package in.sakthi.exception;

public class ServiceException extends RuntimeException {

	/**
	 * Exception handle the Service
	 */

	private static final long serialVersionUID = 1L;

	public ServiceException(String message) {
		super(message);
	}

}
