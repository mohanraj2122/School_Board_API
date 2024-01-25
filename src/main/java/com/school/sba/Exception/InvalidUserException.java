package com.school.sba.Exception;

public class InvalidUserException extends RuntimeException{
	private String message;

	public InvalidUserException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
