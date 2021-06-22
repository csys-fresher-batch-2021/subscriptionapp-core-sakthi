package in.sakthi.exception;

public class DatabaseException extends RuntimeException {

	/**
	 * Exception handle the DAO
	 */

	private static final long serialVersionUID = 1L;

	public DatabaseException(String message) {
		super(message);
	}

}
