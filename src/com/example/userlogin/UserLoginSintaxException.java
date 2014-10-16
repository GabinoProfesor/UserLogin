package com.example.userlogin;

public class UserLoginSintaxException extends Exception {

	/**
	 * 
	 */
	public UserLoginSintaxException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public UserLoginSintaxException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error Sintaxis UserLogin Exception";
	}

}
