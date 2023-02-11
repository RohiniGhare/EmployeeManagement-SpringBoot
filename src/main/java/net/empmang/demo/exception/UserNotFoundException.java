package net.empmang.demo.exception;

public class UserNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String messString) {
		super(messString);
	}

}
