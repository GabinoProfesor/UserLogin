package com.example.userlogin;

public class UserLoginException extends Exception {

	/**
	 * 
	 */
	public UserLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param detailMessage
	 */
	public UserLoginException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error UserLogin Exception";
	}

}
