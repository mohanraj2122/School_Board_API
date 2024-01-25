package com.school.sba.Exception;

public class SchoolAlreadyPresentForAdminException extends RuntimeException{
	

	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public SchoolAlreadyPresentForAdminException(String message) {
		this.message=message;
	}
}
