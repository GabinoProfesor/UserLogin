package com.example.userlogin;

import java.io.Serializable;

public class UserLogin implements Serializable{
	private String login;
	private String password;

	/**
	 * @param login
	 * @param password
	 * @throws UserLoginSintaxException 
	 */
	public UserLogin(String login, String password) throws UserLoginException, UserLoginSintaxException{
		if (!validarSintaxisUserLogin(login, password)) {
			throw new UserLoginSintaxException();
		}
		if (!validarUserLogin(login, password)){
			throw new UserLoginException();
		}
		this.login = login;
		this.password = password;
	}

	private static boolean validarSintaxisUserLogin(String login, String password) {
		return (!login.isEmpty() && !password.isEmpty());
	}
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	private static boolean validarUserLogin(String login, String password) {
		return (login.equals("Admin") && password.equals("1234"));
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserLogin [login=" + login + ", password=" + password + "]";
	}

	
}
