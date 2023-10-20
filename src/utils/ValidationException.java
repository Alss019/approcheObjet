package utils;

public class ValidationException extends Exception{	

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	public ValidationException(String message) throws ValidationException{
			super(message);
	}
}
