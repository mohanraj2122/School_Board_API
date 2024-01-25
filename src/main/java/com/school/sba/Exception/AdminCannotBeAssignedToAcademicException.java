package com.school.sba.Exception;

public class AdminCannotBeAssignedToAcademicException extends RuntimeException{

	private String message;

	public AdminCannotBeAssignedToAcademicException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
