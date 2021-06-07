package sud.exceptions;

public class NoSuchProductException extends Exception{

	private static final long serialVersionUID = -3509126626351212389L;
	
	public NoSuchProductException(String message) {
		super(message);
	}
	
}
