package com.school.sba.Exception;

public class UserAlreadyMappedException extends RuntimeException{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserAlreadyMappedException(String message) {
		super();
		this.message = message;
	}
	
}
