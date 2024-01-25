package com.school.sba.Exception;

/**
 * 
 */
public class DuplicateEntryException extends RuntimeException {

	private String message;

	public DuplicateEntryException(String message) {
	       this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
