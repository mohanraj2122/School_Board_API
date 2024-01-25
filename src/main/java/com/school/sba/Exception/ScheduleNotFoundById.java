package com.school.sba.Exception;

public class ScheduleNotFoundById extends RuntimeException{

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ScheduleNotFoundById(String message) {
		super();
		this.message = message;
	}
	
	
}
