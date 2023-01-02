package exceptions;

@SuppressWarnings("serial")
public class BookUnavailableException extends RuntimeException {
	
	public BookUnavailableException(String msg) {
		super(msg);
	}

}
