package com.school.sba.Exception;

public class ScheduleIsPresentException extends RuntimeException{

	

	private String message;
	
	public ScheduleIsPresentException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
